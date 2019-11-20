package nl.oraculo.popsongs.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    Integer id;

    @Column(nullable = false)
    String naam;
    @Column(nullable = false)
    Integer jaar;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    Artiest artiest;

}
