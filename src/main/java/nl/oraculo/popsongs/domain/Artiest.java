package nl.oraculo.popsongs.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Artiest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Integer id;

    @Column(nullable = false)
    private String naam;

    public Artiest() {
    }

    public Artiest(String naam) {
        this.naam = naam;
    }

    public Integer getId() {
        return id;
    }

//    @JsonValue
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }


}
