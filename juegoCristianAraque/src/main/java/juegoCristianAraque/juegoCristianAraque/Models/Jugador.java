package juegoCristianAraque.juegoCristianAraque.Models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@ToString
@Table(name="jugador")
public class Jugador implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String documento;
        private String nombre;
        private String apellido;


        private static final long serialVersionUID = 1L;

    }

