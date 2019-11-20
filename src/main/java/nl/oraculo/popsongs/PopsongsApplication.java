package nl.oraculo.popsongs;

import nl.oraculo.popsongs.domain.Album;
import nl.oraculo.popsongs.domain.Artiest;
import nl.oraculo.popsongs.domain.GrootsteHit;
import nl.oraculo.popsongs.domain.Song;
import nl.oraculo.popsongs.service.AlbumService;
import nl.oraculo.popsongs.service.ArtiestService;
import nl.oraculo.popsongs.service.GrootsteHitService;
import nl.oraculo.popsongs.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PopsongsApplication implements ApplicationRunner {

	@Autowired
	AlbumService albumService;
	@Autowired
	ArtiestService artiestService;
	@Autowired
	SongService songService;
	@Autowired
	GrootsteHitService grootsteHitService;

	public static void main(String[] args) {
		SpringApplication.run(PopsongsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Album album = new Album("Thriller", 1982);
		albumService.save(album);
		Artiest artiest = new Artiest("Michael Jackson");
		artiestService.save(artiest);
		Song song = new Song("Beat it", 1983, artiest);
		songService.save(song);
		GrootsteHit grootsteHit = new GrootsteHit(artiest, song);
		grootsteHitService.save(grootsteHit);
	}
}
