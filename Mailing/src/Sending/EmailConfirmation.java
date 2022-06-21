package Sending;

import Model.User;

public class EmailConfirmation {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public String getConfiramtionURL() {
        return confiramtionURL;
    }

    public void setConfiramtionURL(String confiramtionURL) {
        this.confiramtionURL = confiramtionURL;
    }

    private String confiramtionURL;

    public User getRecepient() {
        return recepient;
    }

    public void setRecepient(User recepient) {
        this.recepient = recepient;
    }

    private User recepient;

    public EmailConfirmation(User recepient, String message, String confiramtionURL) {
        this.recepient = recepient;
        this.message = message;
        this.message = confiramtionURL;
    }

    void sendConfirmarionEmail() {}
}
