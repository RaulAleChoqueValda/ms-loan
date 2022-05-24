package arquitectura.software.msloan.api;

import arquitectura.software.msloan.bl.LoanDetailsBl;
import arquitectura.software.msloan.entity.LoanDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class LoanDetailsApi {

    private LoanDetailsBl loanDetailsBl;

    @Autowired
    public LoanDetailsApi (LoanDetailsBl loanDetailsBl){
        this.loanDetailsBl = loanDetailsBl;
    }

    @GetMapping(value = "/loanDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LoanDetails> listAll() {
        System.out.println("Invocando al metodo GET");
        return loanDetailsBl.findAll();
    }

    @PostMapping(path="/loanDetails", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public LoanDetails addAddress(@RequestBody LoanDetails loanDetails) {
        System.out.println("Invocando al metodo POST");
        return loanDetailsBl.createLoanDetails(loanDetails);
    }

    @PutMapping(path="/loanDetails/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public LoanDetails updateLoanDetails(@PathVariable("id") Integer id, @RequestBody LoanDetails loanDetails) {
        System.out.println("Invocando al metodo PUT");
        return loanDetailsBl.updateLoanDetails(loanDetails, id);
    }

    @GetMapping(value = "/loanDetails/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public LoanDetails findByLoanDetailsId(@PathVariable("id") Integer id)  {
        System.out.println("Invocando al metodo GET");
        return loanDetailsBl.findByLoanDetailsId(id);
    }

    @DeleteMapping(path="/loanDetails/{id}")
    public String deleteLoanDetails(@PathVariable("id") Integer id) {
        System.out.println("Invocando al metodo DELETE");
        loanDetailsBl.deleteLoanDetails(id);
        return "Borrado Exitosamente";
    }
}
