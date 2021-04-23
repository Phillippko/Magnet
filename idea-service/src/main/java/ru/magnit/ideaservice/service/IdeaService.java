package ru.magnit.ideaservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.magnit.ideaservice.domain.Account;
import ru.magnit.ideaservice.domain.Idea;
import ru.magnit.ideaservice.dto.IdeaDto;
import ru.magnit.ideaservice.repository.AccountRepository;
import ru.magnit.ideaservice.repository.IdeaRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IdeaService {
    private final IdeaRepository ideaRepository;


    public List<Idea> findAllIdeas() {
        List<Idea> ideas = ideaRepository.findAll();
        return ideas;
    }

    public void saveIdea(IdeaDto ideaDto) {
        Idea idea = new Idea(ideaDto);
        ideaRepository.save(idea);
    }
}
