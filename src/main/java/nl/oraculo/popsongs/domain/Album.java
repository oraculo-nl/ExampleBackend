package nl.oraculo.popsongs.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity

public class Album {
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

    public Album() {
    }

    public Album(String naam, Integer jaar, Artiest artiest) {
        this.naam = naam;
        this.jaar = jaar;
        this.artiest = artiest;
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
}
