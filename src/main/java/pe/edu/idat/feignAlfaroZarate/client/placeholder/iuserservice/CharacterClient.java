package pe.edu.idat.feignAlfaroZarate.client.placeholder.iuserservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Map;

@FeignClient(name = "characterClient", url = "https://rickandmortyapi.com/api")
public interface CharacterClient {

    @GetMapping("/character")
    Map<String, Object> obtenerPersonajes();

    @GetMapping("/character/{id}")
    Character obtenerPersonajePorId(@PathVariable("id") Long id);
}