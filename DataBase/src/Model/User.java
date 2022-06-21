package Model;

import java.util.List;

public class User {
    int id;
    String email;
    String name;
    String surname;
    String passwd;
    int age;
    UserHistory userHistory;
    List<MessageComplaint> messageComplaints;
    List<Ticket> tickets;
}
