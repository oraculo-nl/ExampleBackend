package nl.oraculo.popsongs.service;

import nl.oraculo.popsongs.domain.Hit;
import nl.oraculo.popsongs.repository.HitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class HitService {
    @Autowired
    HitRepository hitRepository;

    public Iterable<Hit> findAll() {
        return hitRepository.findAll();
    }
    public Optional<Hit> findById(Integer id) {
        return hitRepository.findById(id);
    }

    public Hit save(Hit grootsteHit) {
        return hitRepository.save(grootsteHit);
    }

    public void delete(Hit grootsteHit) {
        hitRepository.delete(grootsteHit);
    }
}
