package juegoCristianAraque.juegoCristianAraque.Service;



import juegoCristianAraque.juegoCristianAraque.DAO.RondaDAO;
import juegoCristianAraque.juegoCristianAraque.Models.Ronda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RondaService {
    @Autowired
    RondaDAO repo;

    public void CreaRonda(Ronda ronda){
        repo.save(ronda);
    }
}
