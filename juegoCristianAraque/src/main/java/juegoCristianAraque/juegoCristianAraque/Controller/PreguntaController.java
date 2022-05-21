package juegoCristianAraque.juegoCristianAraque.Controller;

import juegoCristianAraque.juegoCristianAraque.Models.Pregunta;
import juegoCristianAraque.juegoCristianAraque.Service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pregunta")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class PreguntaController {

    @Autowired
    PreguntaService preguntaService;

    @PostMapping("/crear")
    public ResponseEntity<?> CreaPregunta(@RequestBody Pregunta pregunta){
        Map<String,Integer> mensaje = new HashMap<>();

        //Long a=dificultad.getRonda().getId_ronda();
        preguntaService.CreaPregunta(pregunta);
        mensaje.put ("llega"+pregunta,0);
        return new ResponseEntity<Map<String,Integer>>(mensaje, HttpStatus.OK);}

       @GetMapping("/obtenerpregunta")
        public ResponseEntity<?>  genera_pregunta(@RequestParam Integer ronda){
            int numero = (int)(Math.random()*4+0);
            Long id= ronda.longValue();
            Pregunta preguntas=new Pregunta();
            Optional<?> pregunta=preguntaService.buscapregunta(id);
            List<Pregunta> listadopregunta= (List<Pregunta>) pregunta.get();
            for(int i=0; i<listadopregunta.size();i++){
                if(i==numero) {
                    return new ResponseEntity (listadopregunta.get(numero),HttpStatus.OK);
                }
            }


            return new ResponseEntity (listadopregunta,HttpStatus.OK);
    }

}
