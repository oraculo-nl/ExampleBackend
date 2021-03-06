package nl.oraculo.popsongs.service;

import nl.oraculo.popsongs.domain.Artiest;
import nl.oraculo.popsongs.domain.Song;
import nl.oraculo.popsongs.repository.ArtiestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
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
        try {
            return artiestRepository.save(artiest);
        } catch (DataIntegrityViolationException d) {
            return null;
        }
    }

    public void delete(Artiest artiest) {
        artiestRepository.delete(artiest);
    }


    public List<Artiest> findByNaam(String naam) {
        return artiestRepository.findByNaam(naam);
    }
}
