package arquitectura.software.msloan.repository;

import arquitectura.software.msloan.entity.LoanDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoanDetailsRepository extends JpaRepository<LoanDetails,Integer> {

    @Query(value="SELECT l FROM LoanDetails l WHERE l.loanId = :id", nativeQuery = true)
    List<LoanDetails> findByLoanId(Integer id);

    @Query(value = "SELECT * FROM LoanDetails l WHERE l.loanDetailsId = :id", nativeQuery = true)
    LoanDetails getLoanDetailsById(Integer id);
}
