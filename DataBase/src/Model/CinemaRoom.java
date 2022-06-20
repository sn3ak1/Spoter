package Model;

import java.util.Date;
import java.util.Dictionary;

public class CinemaRoom {
    int id;
    int seats;
    Dictionary<Movie, Date> movies;
    int seatsTaken;
}
