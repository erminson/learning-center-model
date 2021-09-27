package ru.erminson.ec.dto;

import lombok.Data;

@Data
public class TopicScoreDto {
    private String topicTitle;
    private int score;
    private int durationInDays;
}
