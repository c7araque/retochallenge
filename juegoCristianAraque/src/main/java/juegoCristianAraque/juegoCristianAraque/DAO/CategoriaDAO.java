package juegoCristianAraque.juegoCristianAraque.DAO;

import juegoCristianAraque.juegoCristianAraque.Models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDAO extends JpaRepository<Categoria, Long> {
}
