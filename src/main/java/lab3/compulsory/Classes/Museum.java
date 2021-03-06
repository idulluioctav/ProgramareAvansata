package lab3.compulsory.Classes;

import lab3.compulsory.Interfaces.Payable;
import lab3.compulsory.Interfaces.Visitable;

import java.time.LocalTime;

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

    @Override
    public String toString() {
        return "Museum{" +
                "openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
