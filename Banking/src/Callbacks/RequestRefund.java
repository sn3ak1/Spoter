package Callbacks;

import Model.Ticket;

public class RequestRefund {

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    Ticket ticket;

    void createRefoundRequest(Ticket ticket){}

}
