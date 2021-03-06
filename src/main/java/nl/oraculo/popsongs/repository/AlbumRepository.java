package nl.oraculo.popsongs.repository;

import nl.oraculo.popsongs.domain.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Integer> {
    Iterable<Album> findByNaam(String naam);

    Iterable<Album> findByNaamLike(String naam);
}
