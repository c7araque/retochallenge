package juegoCristianAraque.juegoCristianAraque.Controller;

import juegoCristianAraque.juegoCristianAraque.Models.Jugador;
import juegoCristianAraque.juegoCristianAraque.Service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/jugador")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class JugadorController {

    @Autowired
    JugadorService jugadorService;

    @PostMapping("/crear")
    public ResponseEntity<?> CreaJugador(@RequestBody Jugador jugador){
        Map<String,Integer> mensaje = new HashMap<>();
        jugadorService.CreaJugador(jugador);
        mensaje.put ("llega"+jugador,0);
        return new ResponseEntity<Map<String,Integer>>(mensaje, HttpStatus.OK);}
}
