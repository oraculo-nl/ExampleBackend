package nl.oraculo.popsongs.service;

import nl.oraculo.popsongs.domain.Artiest;
import nl.oraculo.popsongs.domain.Song;
import nl.oraculo.popsongs.repository.ArtiestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtiestService {
    @Autowired
    ArtiestRepository artiestRepository;

    public Iterable<Artiest> findAll() {
        return artiestRepository.findAll();
    }
    public Optional<Artiest> findById(Integer id) {
        return artiestRepository.findById(id);
    }

    public Artiest save(Artiest artiest) {
        return artiestRepository.save(artiest);
    }

    public void delete(Artiest artiest) {
        artiestRepository.delete(artiest);
    }


}
