package nl.oraculo.popsongs.endpoint;

import nl.oraculo.popsongs.domain.Album;
import nl.oraculo.popsongs.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "album")
public class AlbumEndpoint {
    @Autowired
    AlbumService albumService;

    @GetMapping
    public Iterable<Album> findAll() {
        return albumService.findAll();
    }

    @GetMapping(path = "{id}")
    public Optional<Album> findByid(@PathVariable Integer id) {
        return albumService.findById(id);
    }

    @PostMapping
    public void save(Album album) {
        albumService.save(album);
    }

    @PutMapping
    public Album update(Album album) {

        return albumService.save(album);
    }

}