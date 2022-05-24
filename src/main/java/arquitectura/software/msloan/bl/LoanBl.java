package arquitectura.software.msloan.bl;

import arquitectura.software.msloan.entity.Loan;
import arquitectura.software.msloan.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LoanBl {

    private LoanRepository loanRepository;

    @Autowired
    public LoanBl (LoanRepository loanRepository){
        this.loanRepository = loanRepository;
    }

    public List<Loan> findAll(){
        return  loanRepository.getLoans();
    }

    public Loan createLoan(Loan loan){
        return loanRepository.save(loan);
    }

    public Loan updateLoan(Loan loan, Integer loanId){
        Loan loanDB = loanRepository.getLoansById(loanId);
        if (Objects.nonNull(loan.getClientId())){
            loanDB.setClientId(loan.getClientId());
        }
        if (Objects.nonNull(loan.getLoanDate())){
            loanDB.setLoanDate(loan.getLoanDate());
        }
        if (Objects.nonNull(loan.getReturnDate())){
            loanDB.setReturnDate(loan.getReturnDate());
        }
        if (Objects.nonNull(loan.getStatus())){
            loanDB.setStatus(loan.getStatus());
        }
        return loanRepository.save(loanDB);
    }

    public Loan findByLoanId(Integer addressId){
        return loanRepository.getLoansById(addressId);
    }

    public Loan deleteLoan(Integer addressId){
        Loan loanDB = loanRepository.getLoansById(addressId);
        if (Objects.nonNull(loanDB.getStatus())){
            loanDB.setStatus(1);
        }
        return loanRepository.save(loanDB);
    }
}
