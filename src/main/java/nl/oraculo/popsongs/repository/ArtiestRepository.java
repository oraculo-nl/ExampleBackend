package nl.oraculo.popsongs.repository;

import nl.oraculo.popsongs.domain.Artiest;
import org.springframework.data.repository.CrudRepository;

public interface ArtiestRepository extends CrudRepository<Artiest, Integer> {
}
