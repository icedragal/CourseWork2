package model;

import java.time.LocalDateTime;

public class Daily implements Repeatability{

    @Override
    public LocalDateTime nextTime(LocalDateTime currentTime) {
        return currentTime.plusDays(1);
    }

    @Override
    public String toString() {
        return "ежедневная";
    }
}
