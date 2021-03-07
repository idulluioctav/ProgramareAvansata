package main.lab3.compulsory;

import java.time.LocalTime;
import java.util.Map;

public class Church extends Location implements Visitable {
    private LocalTime openingTime, closingTime;

    public Church(){

    }

    public Church(LocalTime openingTime, LocalTime closingTime) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
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
    public String toString() {
        return "Church{" +
                "openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                '}';
    }
}
