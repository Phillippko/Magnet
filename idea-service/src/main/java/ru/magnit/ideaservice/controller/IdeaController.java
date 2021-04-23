package ru.magnit.ideaservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.magnit.ideaservice.domain.Idea;
import ru.magnit.ideaservice.dto.IdeaDto;
import ru.magnit.ideaservice.service.IdeaService;

import java.util.List;

@RestController
@RequiredArgsConstructor

@CrossOrigin(origins = "http://localhost:3000")
public class IdeaController {

    private final IdeaService ideaService;

    @GetMapping("/ideas")
    List<Idea> getAllIdeas(){
        return ideaService.findAllIdeas();
    }

    @PostMapping("/idea")
    void saveIdea(@RequestBody IdeaDto ideaDto){
        ideaService.saveIdea(ideaDto);
    }
}