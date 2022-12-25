package model;

import java.time.LocalDateTime;

public class OneTime implements Repeatability{

    @Override
    public LocalDateTime nextTime(LocalDateTime currentTime) {
        return null;
    }

    @Override
    public String toString() {
        return "однократная";
    }
}
