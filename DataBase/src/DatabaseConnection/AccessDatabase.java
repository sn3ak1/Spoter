package DatabaseConnection;

import Model.*;

public class AccessDatabase {
    Author getAuthor(int id){return new Author();}
    void updateAuthor(Author author){}
    void addAuthor(Author author){}
    void deleteAuthor(Author author){}

    CinemaRoom getCinemaRoom(int id){return new CinemaRoom();}
    void updateCinemaRoom(CinemaRoom cinemaRoom){}
    void addCinemaRoom(CinemaRoom cinemaRoom){}
    void deleteCinemaRoom(CinemaRoom cinemaRoom){}

    Movie getMovie(int id){return new Movie();}
    void updateMovie(Movie movie){}
    void addMovie(Movie movie){}
    void deleteMovie(Movie movie){}

    Payment getPayment(int id){return new Payment();}
    void updatePayment(Payment payment){}
    void addAuthor(Payment payment){}
    void deleteAuthor(Payment payment){}

    TicketComplain getTicketComplain(int id){return new TicketComplain();}
    void updateTicketComplain(TicketComplain ticketComplain){}
    void addTicketComplain(TicketComplain ticketComplain){}
    void deleteTicketComplain(TicketComplain ticketComplain){}

    User getUser(int id){return new User();}
    void updateUser(User user){}
    void addUser(User user){}
    void deleteUser(User user){}

    UserHistory getUserHistory(int id){return new UserHistory();}
    void updateUserHistory(UserHistory userHistory){}
    void addUserHistory(UserHistory userHistory){}
    void deleteUserHistory(UserHistory userHistory){}
}
