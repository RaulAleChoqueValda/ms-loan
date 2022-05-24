package arquitectura.software.msloan.api;

import arquitectura.software.msloan.bl.LoanBl;
import arquitectura.software.msloan.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class LoanApi {

    private LoanBl loanBl;

    @Autowired
    public LoanApi (LoanBl loanBl){
        this.loanBl = loanBl;
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
}
