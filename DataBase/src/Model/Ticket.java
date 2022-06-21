package Model;

import java.util.Date;

public class Ticket {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    Movie movie;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int price;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    User user;

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    Seat seat;

    public CinemaRoom getCinemaRoom() {
        return cinemaRoom;
    }

    public void setCinemaRoom(CinemaRoom cinemaRoom) {
        this.cinemaRoom = cinemaRoom;
    }

    CinemaRoom cinemaRoom;

    public Date getPaymantTimeStamp() {
        return paymantTimeStamp;
    }

    public void setPaymantTimeStamp(Date paymantTimeStamp) {
        this.paymantTimeStamp = paymantTimeStamp;
    }

    public Date paymantTimeStamp;

    public Date getSeansTime() {
        return seansTime;
    }

    public void setSeansTime(Date seansTime) {
        this.seansTime = seansTime;
    }

    public Date seansTime;

}
