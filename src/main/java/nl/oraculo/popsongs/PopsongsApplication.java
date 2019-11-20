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
        Artiest artiest = insertArtiest("Michael Jackson");
        Album album = insertAlbum("Thriller", 1982, artiest);
		Song song = insertSong("Beat it", 1983, artiest);
        insertAlbum("Bad", 1987, artiest);
        insertSong("Smooth Criminal", 1988, artiest);
        insertHit(artiest,song);
        artiest = insertArtiest("Madonna");
        album = insertAlbum("Like a Virgin", 1982, artiest);
        song = insertSong("Material Girl",1985, artiest);
		insertAlbum("True Blue", 1986, artiest);
        insertSong("Open your heart",1986, artiest);
        insertHit(artiest,song);
    }

    public Artiest insertArtiest(String artiestNaam) {
        Artiest artiest = new Artiest(artiestNaam);
        return artiestService.save(artiest);
    }

    public Album insertAlbum(String albumNaam, int albumJaar, Artiest artiest) {
        Album album = new Album(albumNaam, albumJaar, artiest);
        return albumService.save(album);
    }

    public Song insertSong(String songNaam, int songJaar, Artiest artiest) {
        Song song = new Song(songNaam, songJaar, artiest);
        return songService.save(song);
    }

    public void insertHit(Artiest artiest, Song song) {
        GrootsteHit grootsteHit = new GrootsteHit(artiest, song);
        grootsteHitService.save(grootsteHit);
    }
}
