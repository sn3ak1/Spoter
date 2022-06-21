package Callbacks;

import Exceptions.InsufficentFoundsExceptions;
import Model.Ticket;

public class RequestPayment {


    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    Ticket ticket;
    void requstFounds(Ticket ticket) throws InsufficentFoundsExceptions {}

}
