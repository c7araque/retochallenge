package juegoCristianAraque.juegoCristianAraque.Service;

import juegoCristianAraque.juegoCristianAraque.DAO.DificultadDAO;
import juegoCristianAraque.juegoCristianAraque.Models.Dificultad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DificultadService {

    @Autowired
    DificultadDAO repo;

    public void CreaDificultad(Dificultad dificultad){
        repo.save(dificultad);
    }
}
