package arquitectura.software.msloan.repository;

import arquitectura.software.msloan.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan,Integer> {

    @Query(value="SELECT * FROM Loan", nativeQuery = true)
    List<Loan> getLoans();

    @Query(value = "SELECT l FROM Loan l WHERE l.loanId = :id", nativeQuery = true)
    Loan getLoansById(Integer id);

}
