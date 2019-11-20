package nl.oraculo.popsongs.service;

import nl.oraculo.popsongs.domain.Album;
import nl.oraculo.popsongs.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        return albumRepository.save(album);
    }

    public void delete(Album album) {
        albumRepository.delete(album);
    }
}
