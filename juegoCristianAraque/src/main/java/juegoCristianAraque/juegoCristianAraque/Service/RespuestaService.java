package juegoCristianAraque.juegoCristianAraque.Service;

import juegoCristianAraque.juegoCristianAraque.DAO.RespuestaDAO;
import juegoCristianAraque.juegoCristianAraque.Models.Respuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RespuestaService {

    @Autowired
    RespuestaDAO repo;

    public void CreaRespuesta(Respuesta respuesta){
        repo.save(respuesta);
    }
}
