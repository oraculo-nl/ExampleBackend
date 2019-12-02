package nl.oraculo.popsongs.service;

import nl.oraculo.popsongs.domain.Song;
import nl.oraculo.popsongs.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SongService {
    @Autowired
    SongRepository songRepository;

    public Iterable<Song> findAll() {
        return songRepository.findAll();
    }
    public Optional<Song> findById(Integer id) {
        return songRepository.findById(id);
    }

    public Song save(Song song) {
        try {
            return songRepository.save(song);
        } catch (DataIntegrityViolationException d) {
            return null;
        }
    }

    public void delete(Song song) {
        songRepository.delete(song);
    }
}
