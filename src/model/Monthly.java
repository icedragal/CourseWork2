package model;

import java.time.LocalDateTime;

public class Monthly implements Repeatability{
    @Override
    public LocalDateTime nextTime(LocalDateTime currentTime) {
        return currentTime.plusMonths(1);
    }

    @Override
    public String toString() {
        return "ежемесячная";
    }
}
