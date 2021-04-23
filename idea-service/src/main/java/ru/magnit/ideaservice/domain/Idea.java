package ru.magnit.ideaservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.magnit.ideaservice.dto.IdeaDto;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
public class Idea {
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;
    String text;
    String author;
    String header;
    String date;
    int likes;
    int views;

    public Idea(IdeaDto ideaDto) {
        this.author = ideaDto.author;
        this.text = ideaDto.text;
    }
}
