package main.lab3.compulsory;

import java.time.LocalTime;
import java.util.Map;

public class Hotel extends Location implements Classifiable, Payable, Visitable {

    private int ranking;
    private LocalTime openingTime, closingTime;
    private double ticketPrice;

    public Hotel(){

    }

    public Hotel(int ranking, LocalTime openingTime, LocalTime closingTime, double ticketPrice) {
        this.ranking = ranking;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
