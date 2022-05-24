package arquitectura.software.msloan.dto;

public class LoanDetailsDto {

    private Integer loanDetailsId;
    private Integer bookId;
    private Integer loanId;
    private String loanStatus;
    private Integer status;

    public LoanDetailsDto() {
    }

    public LoanDetailsDto(Integer loanDetailsId, Integer bookId, Integer loanId, String loanStatus, Integer status) {
        this.loanDetailsId = loanDetailsId;
        this.bookId = bookId;
        this.loanId = loanId;
        this.loanStatus = loanStatus;
        this.status = status;
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
    public String toString() {
        return "LoanDetailsDto{" +
                "loanDetailsId=" + loanDetailsId +
                ", bookId=" + bookId +
                ", loanId=" + loanId +
                ", loanStatus='" + loanStatus + '\'' +
                ", status=" + status +
                '}';
    }
}
