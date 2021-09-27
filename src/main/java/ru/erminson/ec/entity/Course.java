package ru.erminson.ec.entity;

import lombok.Data;

import java.util.List;

@Data
public class Course {
    private String title;
    private List<Topic> topics;
}
