package model;

import java.time.LocalDateTime;

public class Weekly implements Repeatability{
    @Override
    public LocalDateTime nextTime(LocalDateTime currentTime) {
        return currentTime.plusWeeks(1);
    }

    @Override
    public String toString() {
        return "еженедельная";
    }
}
