package nl.oraculo.popsongs.endpoint;

import nl.oraculo.popsongs.domain.GrootsteHit;
import nl.oraculo.popsongs.service.GrootsteHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "hit")
public class GrootsteHitEndpoint {
    @Autowired
    GrootsteHitService grootsteHitService;

    @GetMapping
    public Iterable<GrootsteHit> findAll() {
        return grootsteHitService.findAll();
    }
}
