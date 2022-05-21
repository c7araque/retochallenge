package juegoCristianAraque.juegoCristianAraque.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="premio")
public class Premio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_premio;

    @OneToOne()
    @JoinColumn(name = "id_ronda")
    private Ronda ronda;
    private static final long serialVersionUID = 1L;
}
