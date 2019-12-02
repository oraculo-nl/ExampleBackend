package nl.oraculo.popsongs.service;

import nl.oraculo.popsongs.domain.Album;
import nl.oraculo.popsongs.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlbumService {
    @Autowired
    AlbumRepository albumRepository;

    public Iterable<Album> findAll() {
        return albumRepository.findAll();
    }

    public Optional<Album> findById(Integer id) {
        return albumRepository.findById(id);
    }

    public Album save(Album album) {
        try {
            return albumRepository.save(album);
        } catch (DataIntegrityViolationException d) {
            return null;
        }
    }

    public void delete(Integer album_id) {
        albumRepository.deleteById(album_id);
    }

    public Iterable<Album> findByNaam(String naam) {
        return albumRepository.findByNaam(naam);
    }

    public Iterable<Album> findByNaamLike(String naam) {
        return albumRepository.findByNaamLike(naam);
    }
}
