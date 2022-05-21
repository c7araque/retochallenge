package juegoCristianAraque.juegoCristianAraque.DAO;

import juegoCristianAraque.juegoCristianAraque.Models.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PreguntaDAO extends JpaRepository<Pregunta, Long> {



    @Query(nativeQuery = true,value = "select pregunta.id_pregunta, Pregunta.descripcion from Pregunta\n" +
            "inner join categoria on (pregunta.id_categoria=categoria.id_categoria)\n" +
            "where categoria.id_categoria=?1")
    public  List<?> findByidCategoria(Long id);
}
