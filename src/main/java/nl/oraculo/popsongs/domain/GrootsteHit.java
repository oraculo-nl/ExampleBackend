package nl.oraculo.popsongs.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class GrootsteHit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private Artiest artiest;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private Song song;

    public GrootsteHit() {
    }

    public GrootsteHit(Artiest artiest, Song song) {
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
