package oop_test.ch10;

public class Ticket {

    private String movieTitle;
    private int price;

    public Ticket(int price, String movieTitle) {
        this.price = price;
        this.movieTitle = movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
