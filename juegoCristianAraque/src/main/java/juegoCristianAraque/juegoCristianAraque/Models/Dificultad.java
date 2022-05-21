package juegoCristianAraque.juegoCristianAraque.Models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="dificultad")
public class Dificultad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_dificultad;
    private String Descripcion;

    @OneToOne()
    @JoinColumn(name = "id_ronda")
    private Ronda ronda;

    private static final long serialVersionUID = 1L;

}
