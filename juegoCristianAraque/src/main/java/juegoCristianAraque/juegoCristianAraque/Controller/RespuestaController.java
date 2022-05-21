package juegoCristianAraque.juegoCristianAraque.Controller;

import juegoCristianAraque.juegoCristianAraque.Models.Respuesta;
import juegoCristianAraque.juegoCristianAraque.Service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/respuesta")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class RespuestaController {

    @Autowired
    RespuestaService respuestaService;

    @PostMapping("/crear")
    public ResponseEntity<?> CreaRespuesta(@RequestBody Respuesta respuesta){
        Map<String,Integer> mensaje = new HashMap<>();
        respuestaService.CreaRespuesta(respuesta);
        mensaje.put ("llega"+respuesta,0);
        return new ResponseEntity<Map<String,Integer>>(mensaje, HttpStatus.OK);}
}
