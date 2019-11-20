package nl.oraculo.popsongs.repository;

import nl.oraculo.popsongs.domain.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Integer> {
}
