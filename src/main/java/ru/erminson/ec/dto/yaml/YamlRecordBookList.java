package ru.erminson.ec.dto.yaml;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.erminson.ec.dto.RecordBookDto;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class YamlRecordBookList {
    List<RecordBookDto> recordBooks;
}
