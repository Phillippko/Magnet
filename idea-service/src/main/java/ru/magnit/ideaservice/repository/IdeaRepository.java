package ru.magnit.ideaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.magnit.ideaservice.domain.Idea;

import java.util.List;

public interface IdeaRepository extends JpaRepository<Idea, Long> {
}
