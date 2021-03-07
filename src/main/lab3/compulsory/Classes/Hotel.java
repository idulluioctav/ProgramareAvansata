package main.lab3.compulsory.Classes;

import main.lab3.compulsory.Interfaces.Classifiable;
import main.lab3.compulsory.Interfaces.Payable;
import main.lab3.compulsory.Interfaces.Visitable;

import java.time.LocalTime;

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

    @Override
    public String toString() {
        return "Hotel{" +
                "ranking=" + ranking +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
