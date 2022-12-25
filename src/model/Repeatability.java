package model;

import java.time.LocalDateTime;

public interface Repeatability {
    LocalDateTime nextTime(LocalDateTime currentTime);

}
