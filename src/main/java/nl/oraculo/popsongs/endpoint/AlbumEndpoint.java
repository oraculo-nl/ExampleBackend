package nl.oraculo.popsongs.endpoint;

import nl.oraculo.popsongs.domain.Album;
import nl.oraculo.popsongs.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "album")
public class AlbumEndpoint {
    @Autowired
    AlbumService albumService;

    @GetMapping
    public Iterable<Album> findAll() {
        return albumService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Album> findByid(@PathVariable Integer id) {
        return albumService.findById(id);
    }

    @PostMapping
    public Album save(@RequestBody Album album) {
        return albumService.save(album);
    }

    @GetMapping(path = "/naam/{naam}")
    public Iterable<Album> findByNaam(@PathVariable String naam) {
        return albumService.findByNaam(naam);
    }
    @GetMapping(path = "/like/{naam}")
    public Iterable<Album> findByNaamLike(@PathVariable String naam) {
        return albumService.findByNaamLike(naam);
    }

    @PutMapping
    public Album update(@RequestBody Album album) {
        return albumService.save(album);
    }

    @DeleteMapping(path = "/{album_id}")
    public void delete(@PathVariable Integer album_id) {
        albumService.delete(album_id);
    }

}
