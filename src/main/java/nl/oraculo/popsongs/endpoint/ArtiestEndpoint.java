package nl.oraculo.popsongs.endpoint;

import nl.oraculo.popsongs.domain.Artiest;
import nl.oraculo.popsongs.service.ArtiestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "artiest")
public class ArtiestEndpoint {
    @Autowired
    ArtiestService artiestService;
    @GetMapping
    public Iterable<Artiest> findAll() {
        return artiestService.findAll();
    }
    @GetMapping(path = "{id}")
    public Optional<Artiest> findById(@PathVariable int id) {
        return artiestService.findById(id);
    }
    @PostMapping
    public Artiest save(@RequestBody Artiest artiest) {
        return artiestService.save(artiest);
    }
}
