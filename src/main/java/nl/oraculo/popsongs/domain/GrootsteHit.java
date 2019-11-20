package nl.oraculo.popsongs.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class GrootsteHit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    Integer id;

    @Column(nullable = false)
    Integer jaar;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    Artiest artiest;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    Song song;
}
