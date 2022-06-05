package arquitectura.software.msloan.api;

import arquitectura.software.msloan.bl.LoanBl;
import arquitectura.software.msloan.dto.ClientDto;
import arquitectura.software.msloan.entity.Loan;
import arquitectura.software.msloan.service.ClientService;

import arquitectura.software.msloan.service.MSBookService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping("/v1/api")
public class LoanApi {

    private LoanBl loanBl;
    private MSBookService msBookService;
    private static Logger LOGGER = LoggerFactory.getLogger(LoanApi.class);

    @Autowired
    public LoanApi (LoanBl loanBl, MSBookService msBookService){
        this.loanBl = loanBl;
        this.msBookService = msBookService;
    }
    

    @GetMapping(value = "/loans", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Loan> listAll() {
        System.out.println("Invocando al metodo GET");
        return loanBl.findAll();
    }

    @PostMapping(path="/loans", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Loan addLoan(@RequestBody Loan loan) {
        System.out.println("Invocando al metodo POST");
        return loanBl.createLoan(loan);
    }

    @PutMapping(path="/loans/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Loan updateLoan(@PathVariable("id") Integer id, @RequestBody Loan loan) {
        System.out.println("Invocando al metodo PUT");
        return loanBl.updateLoan(loan, id);
    }

    @GetMapping(value = "/loans/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Loan findByLoanId(@PathVariable("id") Integer id)  {
        System.out.println("Invocando al metodo GET");
        return loanBl.findByLoanId(id);
    }

    @DeleteMapping(path="/loans/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        System.out.println("Invocando al metodo DELETE");
        loanBl.deleteLoan(id);
        return "Borrado Exitosamente";
    }

    @GetMapping(value = "/loans/clients", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClientDto> listaClientes()  {
        System.out.println("TAMANIO DE LA LISTA");
        return this.loanBl.listClients();
    }
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public ResponseEntity<List<?>> getBooks() {
        LOGGER.info("Invocando al servicio REST");
        var bookList = msBookService.getBooks();
        LOGGER.info("Invocacion exitosa", bookList);
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

}
