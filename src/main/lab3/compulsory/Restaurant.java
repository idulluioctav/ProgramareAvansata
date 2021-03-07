package main.lab3.compulsory;

import java.time.LocalTime;
import java.util.Map;

public class Restaurant extends Location implements Classifiable, Visitable {

    private LocalTime openingTime, closingTime;
    private int ranking;

    public Restaurant(){

    }

    public Restaurant(LocalTime openingTime, LocalTime closingTime, int ranking) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
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
    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
