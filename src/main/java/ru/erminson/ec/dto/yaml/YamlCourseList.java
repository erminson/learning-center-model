package ru.erminson.ec.dto.yaml;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.erminson.ec.entity.Course;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class YamlCourseList {
    List<Course> courses;
}
