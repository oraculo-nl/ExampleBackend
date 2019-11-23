package nl.oraculo.popsongs.endpoint;

import nl.oraculo.popsongs.domain.Song;
import nl.oraculo.popsongs.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "song")
public class SongEndpoint {
    @Autowired
    SongService songService;
    @GetMapping
    public Iterable<Song> findAll() {
        return songService.findAll();
    }
}
