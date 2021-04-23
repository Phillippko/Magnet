package ru.magnit.ideaservice.domain;

import lombok.NoArgsConstructor;
import ru.magnit.ideaservice.dto.IdeaDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Idea {
    @GeneratedValue
    @Id
    Long id;
    String text;
    String author;

    public Idea(IdeaDto ideaDto) {
        this.author = ideaDto.author;
        this.text = ideaDto.text;
    }
}
