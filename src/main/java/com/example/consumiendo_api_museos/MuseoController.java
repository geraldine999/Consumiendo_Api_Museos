package com.example.consumiendo_api_museos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("museos")
public class MuseoController {
    //Crear una api que muestre el nombre de todos los museos de Argentina, con su dirección y teléfono.
    //
    //https://www.cultura.gob.ar/api/v2.0/museos/

    @GetMapping
    public List<Museo> getMuseos(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity <ListaMuseos> listaMuseos = restTemplate.getForEntity("https://www.cultura.gob.ar/api/v2.0/museos/", ListaMuseos.class);
        return listaMuseos.getBody().getResults();
    }

    @GetMapping("nombres")
    public List<String> getNombres(){
        List<String> nombres = getMuseos().stream().map(museo -> museo.getNombre()).toList();
        return nombres;

        }


}
