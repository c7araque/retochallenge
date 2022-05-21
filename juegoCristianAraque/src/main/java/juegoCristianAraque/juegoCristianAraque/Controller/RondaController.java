package juegoCristianAraque.juegoCristianAraque.Controller;

import juegoCristianAraque.juegoCristianAraque.Models.Ronda;
import juegoCristianAraque.juegoCristianAraque.Service.RondaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/rondas")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class RondaController {

    @Autowired
    RondaService rondaService;

    @PostMapping("/crear")
    public ResponseEntity<?> CreaRonda(@RequestBody Ronda ronda){
        Map<String,Integer> mensaje = new HashMap<>();
        rondaService.CreaRonda(ronda);
        mensaje.put ("llega"+ronda,0);
        return new ResponseEntity<Map<String,Integer>>(mensaje, HttpStatus.OK);}
    }


