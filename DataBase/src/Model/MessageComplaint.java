package Model;

import java.util.Date;

public class MessageComplaint {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public Ticket getPayment() {
        return payment;
    }

    public void setPayment(Ticket payment) {
        this.payment = payment;
    }

    Ticket payment;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    Date date;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String description;
}
