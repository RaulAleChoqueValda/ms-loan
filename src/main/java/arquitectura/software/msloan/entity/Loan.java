package arquitectura.software.msloan.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "loan_details")
@NamedQueries({
        @NamedQuery(name = "LoanDetails.findAll", query = "SELECT l FROM Loan l"),
        @NamedQuery(name = "LoanDetails.findByLoanId", query = "SELECT l FROM Loan l WHERE l.loanId = :loanId")})
public class Loan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "loan_id")
    private Integer loanId;
    @Column(name = "client_id")
    private Integer clientId;
    @Column(name = "loan_date")
    private Date loanDate;
    @Column(name = "return_date")
    private Date returnDate;
    @Column(name = "status")
    private Integer status;

    public Loan() {
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
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
        Loan loan = (Loan) o;
        return Objects.equals(loanId, loan.loanId) && Objects.equals(clientId, loan.clientId) && Objects.equals(loanDate, loan.loanDate) && Objects.equals(returnDate, loan.returnDate) && Objects.equals(status, loan.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanId, clientId, loanDate, returnDate, status);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", clientId=" + clientId +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                ", status=" + status +
                '}';
    }
}
