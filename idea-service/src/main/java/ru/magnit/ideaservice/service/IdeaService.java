package ru.magnit.ideaservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.magnit.ideaservice.domain.Account;
import ru.magnit.ideaservice.domain.Idea;
import ru.magnit.ideaservice.dto.IdeaDto;
import ru.magnit.ideaservice.dto.RequestParams;
import ru.magnit.ideaservice.repository.AccountRepository;
import ru.magnit.ideaservice.repository.IdeaRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class IdeaService {
    private final IdeaRepository ideaRepository;


    public List<Idea> findIdeas(RequestParams requestParams) {
        if(requestParams == null)
            return ideaRepository.findAll();
        else
            return getIdeasFilteredByRequestParams(requestParams);
    }

    private List<Idea> getIdeasFilteredByRequestParams(RequestParams requestParams) {
        Stream<Idea> ideasStream = ideaRepository.findAll().stream();
        if(requestParams.region != null)
            ideasStream = ideasStream.filter(x -> x.getRegion().equals(requestParams.region));
        if(requestParams.status != null)
            ideasStream = ideasStream.filter(x -> x.getStatus().equals(requestParams.status));
        if(requestParams.author != null)
            ideasStream = ideasStream.filter(x -> x.getAuthor().equals(requestParams.author));
        return ideasStream.collect(Collectors.toList());

    }

    public void saveIdea(IdeaDto ideaDto) {
        Idea idea = new Idea(ideaDto);
        ideaRepository.save(idea);
    }

}
