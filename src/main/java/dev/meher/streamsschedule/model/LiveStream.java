package dev.meher.streamsschedule.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record LiveStream(String id, String title, String description, String url, LocalDateTime startTime, LocalDateTime endTime) {
    public LiveStream(String id, String title, String description, String url, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
