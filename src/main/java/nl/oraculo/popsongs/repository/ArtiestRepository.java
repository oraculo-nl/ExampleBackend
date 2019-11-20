package nl.oraculo.popsongs.repository;

import nl.oraculo.popsongs.domain.Artiest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArtiestRepository extends CrudRepository<Artiest, Integer> {

    List<Artiest> findByNaam(String naam);
}
