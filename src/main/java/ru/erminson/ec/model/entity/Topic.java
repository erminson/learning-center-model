package ru.erminson.ec.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Topic {
    private String title;
    private Integer durationInHours;
}
