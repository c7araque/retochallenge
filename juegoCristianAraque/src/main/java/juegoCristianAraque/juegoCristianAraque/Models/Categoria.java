package juegoCristianAraque.juegoCristianAraque.Models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Table(name="categoria")
@Entity
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_categoria;

    private String Descripcion;


    @OneToOne()
    @JoinColumn(name = "id_dificultad")
    private Dificultad dificultades;

    @OneToMany()
    private List<Pregunta> preguntas;

    private static final long serialVersionUID = 1L;
}
