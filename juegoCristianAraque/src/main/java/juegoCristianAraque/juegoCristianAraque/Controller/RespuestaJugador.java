package juegoCristianAraque.juegoCristianAraque.Controller;

import juegoCristianAraque.juegoCristianAraque.DTO.PreguntaRespuestaDTO;
import juegoCristianAraque.juegoCristianAraque.Models.Pregunta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/preguntajugador")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class RespuestaJugador {

  /*  @GetMapping("obtener pregunta")
    public ResponseEntity<?>  genera_pregunta(@RequestParam Integer ronda){
        Pregunta pregunta=



        return new ResponseEntity (HttpStatus.OK);
    }*/
}
