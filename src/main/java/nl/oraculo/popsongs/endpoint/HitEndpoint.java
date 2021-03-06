package nl.oraculo.popsongs.endpoint;

import nl.oraculo.popsongs.domain.Hit;
import nl.oraculo.popsongs.service.HitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "hit")
public class HitEndpoint {
    @Autowired
    HitService grootsteHitService;

    @GetMapping
    public Iterable<Hit> findAll() {
        return grootsteHitService.findAll();
    }
}
