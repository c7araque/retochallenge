package juegoCristianAraque.juegoCristianAraque.Models;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@Table(name="ronda")
public class Ronda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_ronda;

    private String Descripcion;

    private static final long serialVersionUID = 1L;
}
