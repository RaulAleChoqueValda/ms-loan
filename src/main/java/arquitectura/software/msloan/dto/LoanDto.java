package arquitectura.software.msloan.dto;

import java.util.Date;

public class LoanDto {

    private Integer loanId;
    private Integer clientId;
    private Date loanDate;
    private Date returnDate;
    private Integer status;

    public LoanDto() {
    }

    public LoanDto(Integer loanId, Integer clientId, Date loanDate, Date returnDate, Integer status) {
        this.loanId = loanId;
        this.clientId = clientId;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.status = status;
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
    public String toString() {
        return "LoanDto{" +
                "loanId=" + loanId +
                ", clientId=" + clientId +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                ", status=" + status +
                '}';
    }
}
