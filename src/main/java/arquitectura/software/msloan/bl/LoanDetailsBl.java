package arquitectura.software.msloan.bl;

import arquitectura.software.msloan.entity.LoanDetails;
import arquitectura.software.msloan.repository.LoanDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LoanDetailsBl {

    private LoanDetailsRepository loanDetailsRepository;

    @Autowired
    public LoanDetailsBl(LoanDetailsRepository loanDetailsRepository){
        this.loanDetailsRepository=loanDetailsRepository;
    }

    public List<LoanDetails> findAll(){
        return loanDetailsRepository.findAll();
    }

    public LoanDetails createLoanDetails(LoanDetails loanDetails){
        return loanDetailsRepository.save(loanDetails);
    }

    public LoanDetails updateLoanDetails(LoanDetails loanDetails, Integer loanDetailsId){
        LoanDetails loanDetailsDB = loanDetailsRepository.getLoanDetailsById(loanDetailsId);
        if (Objects.nonNull(loanDetails.getBookId())){
            loanDetailsDB.setBookId(loanDetails.getBookId());
        }
        if (Objects.nonNull(loanDetails.getLoanId())){
            loanDetailsDB.setLoanId(loanDetails.getLoanId());
        }
        if (Objects.nonNull(loanDetails.getLoanStatus()) && !"".equalsIgnoreCase(loanDetails.getLoanStatus())){
            loanDetailsDB.setLoanStatus(loanDetails.getLoanStatus());
        }
        if (Objects.nonNull(loanDetails.getStatus())){
            loanDetailsDB.setStatus(loanDetails.getStatus());
        }
        return loanDetailsRepository.save(loanDetailsDB);
    }

    public LoanDetails findByLoanDetailsId(Integer loanDetailsId){
        return loanDetailsRepository.getLoanDetailsById(loanDetailsId);
    }

    public LoanDetails deleteLoanDetails(Integer loanDetailsId){
        LoanDetails loanDetailsDB = loanDetailsRepository.getLoanDetailsById(loanDetailsId);
        if (Objects.nonNull(loanDetailsDB.getStatus())){
            loanDetailsDB.setStatus(1);
        }
        return loanDetailsRepository.save(loanDetailsDB);
    }
}
