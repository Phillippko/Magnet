package ru.magnit.ideaservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.magnit.ideaservice.domain.Idea;
import ru.magnit.ideaservice.dto.IdeaDto;
import ru.magnit.ideaservice.service.IdeaService;

import java.util.List;

@RestController
public class IdeaController {

    private IdeaService ideaService;

    @GetMapping("/ideas")
    List<Idea> getAllIdeas(){
        return ideaService.findAllIdeas();
    }
    @PostMapping("/idea")
    void saveIdea(@RequestBody IdeaDto ideaDto){
        ideaService.saveIdea(ideaDto);
    }
}