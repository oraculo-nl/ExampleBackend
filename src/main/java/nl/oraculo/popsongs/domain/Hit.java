package nl.oraculo.popsongs.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
public class Hit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    private Artiest artiest;

    @JsonIgnoreProperties({"jaar","artiest"})
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    private Song song;

    public Hit() {
    }

    public Hit(Artiest artiest, Song song) {
        this.artiest = artiest;
        this.song = song;
    }

    public Artiest getArtiest() {
        return artiest;
    }

    public void setArtiest(Artiest artiest) {
        this.artiest = artiest;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
