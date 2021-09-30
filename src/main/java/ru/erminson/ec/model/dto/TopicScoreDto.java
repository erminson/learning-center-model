package ru.erminson.ec.model.dto;

import lombok.Data;

@Data
public class TopicScoreDto {
    private String topicTitle;
    private int score;
    private int durationInDays;
}
