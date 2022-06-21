package Callbacks;

public class RequestPaymentStatus {
    private String status;

    public RequestPaymentStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
