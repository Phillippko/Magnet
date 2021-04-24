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
    String region;
    int likes;
    int views;
    Status status = Status.NOT_MODERATED;

    public Idea(IdeaDto ideaDto) {
        this.text = ideaDto.text;
        this.author = ideaDto.author;
        this.header = ideaDto.header;
        this.date = ideaDto.date;
        this.region = ideaDto.region;
        this.likes = ideaDto.likes;
        this.views = ideaDto.views;

    }
    public enum Status{
        NOT_MODERATED, OK
    }
}
