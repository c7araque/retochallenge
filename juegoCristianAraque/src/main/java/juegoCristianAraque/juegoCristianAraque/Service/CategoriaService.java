package juegoCristianAraque.juegoCristianAraque.Service;

import juegoCristianAraque.juegoCristianAraque.DAO.CategoriaDAO;
import juegoCristianAraque.juegoCristianAraque.Models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoriaService {

    @Autowired
    CategoriaDAO repo;

    public void CreaCategoria(Categoria categoria){
        repo.save(categoria);
    }

}
