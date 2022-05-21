package juegoCristianAraque.juegoCristianAraque.Service;

import juegoCristianAraque.juegoCristianAraque.DAO.JugadorDAO;
import juegoCristianAraque.juegoCristianAraque.Models.Jugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadorService{
    @Autowired
    JugadorDAO repo;
    public void CreaJugador(Jugador jugador){
        repo.save(jugador);
    }
}
