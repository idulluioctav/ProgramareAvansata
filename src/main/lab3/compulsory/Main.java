package main.lab3.compulsory;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        City c = new City();

        Hotel v1 = new Hotel();
        v1.setOpeningTime(LocalTime.of(6,0));
        v1.setClosingTime(LocalTime.MIDNIGHT);
        v1.setTicketPrice(150);
        v1.setRanking(1);

        Museum v2 = new Museum(LocalTime.of(9, 30), LocalTime.parse("17:00"), 20);

        Museum v3 = new Museum();
        v3.setOpeningTime(LocalTime.of(9, 30));
        v3.setClosingTime(LocalTime.parse("17:00"));
        v3.setTicketPrice(20);

        Church v4 = new Church();
        v4.setOpeningTime(LocalTime.of(7, 0));
        v4.setClosingTime(LocalTime.MIDNIGHT);

        Church v5 = new Church(LocalTime.of(6,0),LocalTime.MIDNIGHT);

        Restaurant v6 = new Restaurant();
        v6.setOpeningTime(LocalTime.of(8,0));
        v6.setClosingTime(LocalTime.parse("23:00"));
        v6.setRanking(2);

    }
}
