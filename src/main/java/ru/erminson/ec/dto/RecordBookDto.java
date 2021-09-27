package ru.erminson.ec.dto;

import lombok.Data;

import java.util.List;

@Data
public class RecordBookDto {
    private String studentName;
    private String courseTitle;
    private String startDate;
    private List<TopicScoreDto> topics;
}
