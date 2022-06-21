package Model;

import java.util.Date;
import java.util.Dictionary;

public class CinemaRoom {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    int seats;

    public Dictionary<Movie, Date> getMovies() {
        return movies;
    }

    public void setMovies(Dictionary<Movie, Date> movies) {
        this.movies = movies;
    }

    Dictionary<Movie, Date> movies;

    public int getSeatsTaken() {
        return seatsTaken;
    }

    public void setSeatsTaken(int seatsTaken) {
        this.seatsTaken = seatsTaken;
    }

    int seatsTaken;

}
