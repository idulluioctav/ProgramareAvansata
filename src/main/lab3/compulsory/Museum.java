package main.lab3.compulsory;

import java.time.LocalTime;
import java.util.Map;

public class Museum extends Location implements Visitable, Payable {

    private LocalTime openingTime, closingTime;
    private double ticketPrice;

    public Museum(){

    }

    public Museum(LocalTime openingTime, LocalTime closingTime, double ticketPrice) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.ticketPrice = ticketPrice;
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
