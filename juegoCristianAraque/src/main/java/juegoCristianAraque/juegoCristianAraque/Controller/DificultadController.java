package juegoCristianAraque.juegoCristianAraque.Controller;


import juegoCristianAraque.juegoCristianAraque.Models.Dificultad;
import juegoCristianAraque.juegoCristianAraque.Models.Ronda;
import juegoCristianAraque.juegoCristianAraque.Service.DificultadService;
import juegoCristianAraque.juegoCristianAraque.Service.RondaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/dificultad")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class DificultadController {
    @Autowired
    DificultadService dificultadService;

    @PostMapping("/crear")
    public ResponseEntity<?> CreaDificultad(@RequestBody Dificultad dificultad){
        Map<String,Integer> mensaje = new HashMap<>();

        //Long a=dificultad.getRonda().getId_ronda();
        dificultadService.CreaDificultad(dificultad);
        mensaje.put ("llega"+dificultad,0);
        return new ResponseEntity<Map<String,Integer>>(mensaje, HttpStatus.OK);}
}
