package lesson_26.homework;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)

public enum Subject {

    ENGLISH("English"),
    MATH("Math"),
    PE("Pe"),
    ART("Art"),
    MUSIC("Music");

    private String displaySubject;

    Subject(String displaySubject) {
        this.displaySubject = displaySubject;
    }

    @JsonValue
    public String getDisplaySubject() {
        return displaySubject;
    }
}
