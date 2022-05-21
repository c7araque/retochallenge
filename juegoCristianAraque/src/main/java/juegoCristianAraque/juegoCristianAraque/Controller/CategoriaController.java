package juegoCristianAraque.juegoCristianAraque.Controller;

import juegoCristianAraque.juegoCristianAraque.Models.Categoria;
import juegoCristianAraque.juegoCristianAraque.Models.Dificultad;
import juegoCristianAraque.juegoCristianAraque.Service.CategoriaService;
import juegoCristianAraque.juegoCristianAraque.Service.DificultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/categoria")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping("/crear")
    public ResponseEntity<?> CreaCategoria(@RequestBody Categoria categoria){
        Map<String,Integer> mensaje = new HashMap<>();

        //Long a=dificultad.getRonda().getId_ronda();
        categoriaService.CreaCategoria(categoria);
        mensaje.put ("llega"+categoria,0);
        return new ResponseEntity<Map<String,Integer>>(mensaje, HttpStatus.OK);}
}
