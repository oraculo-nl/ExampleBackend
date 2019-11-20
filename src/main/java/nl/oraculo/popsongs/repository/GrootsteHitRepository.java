package nl.oraculo.popsongs.repository;

import nl.oraculo.popsongs.domain.Hit;
import org.springframework.data.repository.CrudRepository;

public interface GrootsteHitRepository extends CrudRepository<Hit, Integer> {
}
