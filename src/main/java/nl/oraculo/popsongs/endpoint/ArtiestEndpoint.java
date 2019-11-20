package nl.oraculo.popsongs.endpoint;

import nl.oraculo.popsongs.domain.Artiest;
import nl.oraculo.popsongs.service.ArtiestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "artiest")
public class ArtiestEndpoint {
    @Autowired
    ArtiestService artiestService;
    @GetMapping
    public Iterable<Artiest> findAll() {
        return artiestService.findAll();
    }
}
