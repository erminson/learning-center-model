package ru.erminson.ec.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Course {
    private String title;
    private List<Topic> topics;
}
