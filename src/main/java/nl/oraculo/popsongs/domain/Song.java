package nl.oraculo.popsongs.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"naam", "jaar", "artiest_id"})})
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    @Column(nullable = false)
    private String naam;
    @Column(nullable = false)
    private Integer jaar;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Artiest artiest;

    @JsonIgnoreProperties({"jaar","artiest"})
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Album album;

    public Song() {
    }

    public Song(String naam, Integer jaar, Artiest artiest, Album album) {
        this.naam = naam;
        this.jaar = jaar;
        this.artiest = artiest;
        this.album = album;
    }

    public Integer getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Integer getJaar() {
        return jaar;
    }

    public void setJaar(Integer jaar) {
        this.jaar = jaar;
    }

    public Artiest getArtiest() {
        return artiest;
    }

    public void setArtiest(Artiest artiest) {
        this.artiest = artiest;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
