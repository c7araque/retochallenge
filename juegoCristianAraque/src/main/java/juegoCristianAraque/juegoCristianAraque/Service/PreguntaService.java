package juegoCristianAraque.juegoCristianAraque.Service;

import juegoCristianAraque.juegoCristianAraque.DAO.PreguntaDAO;
import juegoCristianAraque.juegoCristianAraque.Models.Pregunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PreguntaService {

    @Autowired
    PreguntaDAO repo;

    public void CreaPregunta(Pregunta pregunta){
        repo.save(pregunta);
    }

    public Optional<?> buscapregunta(Long id ){
        return Optional.ofNullable(repo.findByidCategoria(id));
    }
}
