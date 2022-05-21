package juegoCristianAraque.juegoCristianAraque.Models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@ToString
@Table(name="respuesta")
public class Respuesta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id_respuesta;

    public boolean estado;

    private String Descripcion;

    @ManyToOne()
    private Pregunta pregunta;


    private static final long serialVersionUID = 1L;


}
