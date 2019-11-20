package nl.oraculo.popsongs.service;

import nl.oraculo.popsongs.domain.GrootsteHit;
import nl.oraculo.popsongs.domain.Song;
import nl.oraculo.popsongs.repository.GrootsteHitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class GrootsteHitService {
    @Autowired
    GrootsteHitRepository grootsteHitRepository;

    public Iterable<GrootsteHit> findAll() {
        return grootsteHitRepository.findAll();
    }
    public Optional<GrootsteHit> findById(Integer id) {
        return grootsteHitRepository.findById(id);
    }

    public GrootsteHit save(GrootsteHit grootsteHit) {
        return grootsteHitRepository.save(grootsteHit);
    }

    public void delete(GrootsteHit grootsteHit) {
        grootsteHitRepository.delete(grootsteHit);
    }
}
