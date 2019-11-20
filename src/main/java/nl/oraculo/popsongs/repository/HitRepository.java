package nl.oraculo.popsongs.repository;

import nl.oraculo.popsongs.domain.Hit;
import org.springframework.data.repository.CrudRepository;

public interface HitRepository extends CrudRepository<Hit, Integer> {
}
