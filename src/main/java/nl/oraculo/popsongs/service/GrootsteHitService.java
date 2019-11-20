package nl.oraculo.popsongs.service;

import nl.oraculo.popsongs.domain.Hit;
import nl.oraculo.popsongs.repository.GrootsteHitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class GrootsteHitService {
    @Autowired
    GrootsteHitRepository grootsteHitRepository;

    public Iterable<Hit> findAll() {
        return grootsteHitRepository.findAll();
    }
    public Optional<Hit> findById(Integer id) {
        return grootsteHitRepository.findById(id);
    }

    public Hit save(Hit grootsteHit) {
        return grootsteHitRepository.save(grootsteHit);
    }

    public void delete(Hit grootsteHit) {
        grootsteHitRepository.delete(grootsteHit);
    }
}
