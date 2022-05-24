package arquitectura.software.msloan.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Loan_details")
@NamedQueries({
        @NamedQuery(name = "LoanDetails.findAll", query = "SELECT l FROM LoanDetails l"),
        @NamedQuery(name = "LoanDetails.findByLoanDetailsId", query = "SELECT l FROM LoanDetails l WHERE l.loanDetailsId = :loanDetailsId"),
        @NamedQuery(name = "LoanDetails.findByLoanId", query = "SELECT l FROM LoanDetails l WHERE l.loanId = :loanId")})
public class LoanDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "loan_details_id")
    private Integer loanDetailsId;
    @Column(name = "book_id")
    private Integer bookId;
    @Column(name = "loan_id")
    private Integer loanId;
    @Column(name = "loan_status")
    private String loanStatus;
    @Column(name = "atatus")
    private Integer status;

    public LoanDetails() {
    }

    public Integer getLoanDetailsId() {
        return loanDetailsId;
    }

    public void setLoanDetailsId(Integer loanDetailsId) {
        this.loanDetailsId = loanDetailsId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanDetails that = (LoanDetails) o;
        return Objects.equals(loanDetailsId, that.loanDetailsId) && Objects.equals(bookId, that.bookId) && Objects.equals(loanId, that.loanId) && Objects.equals(loanStatus, that.loanStatus) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanDetailsId, bookId, loanId, loanStatus, status);
    }

    @Override
    public String toString() {
        return "LoanDetails{" +
                "loanDetailsId=" + loanDetailsId +
                ", bookId=" + bookId +
                ", loanId=" + loanId +
                ", loanStatus='" + loanStatus + '\'' +
                ", status=" + status +
                '}';
    }
}
