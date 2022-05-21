package juegoCristianAraque.juegoCristianAraque.DAO;


import juegoCristianAraque.juegoCristianAraque.Models.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorDAO  extends JpaRepository<Jugador,Long> {
}
