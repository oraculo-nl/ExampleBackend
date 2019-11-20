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



    public Album() {
    }

    public Album(String naam, Integer jaar) {
        this.naam = naam;
        this.jaar = jaar;
    }

    public Integer getJaar() {
        return jaar;
    }

    public void setJaar(Integer jaar) {
        this.jaar = jaar;
    }
}
