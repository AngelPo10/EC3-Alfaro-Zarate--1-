package pe.edu.idat.feignAlfaroZarate.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.idat.feignAlfaroZarate.client.placeholder.iuserservice.Character;
import pe.edu.idat.feignAlfaroZarate.service.ICharacterService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/character")
public class CharacterController {
    private final ICharacterService characterService;

    public CharacterController(ICharacterService characterService) {
        this.characterService = characterService;
    }
    //este es el endpoint para que nos todos los personajes
    @GetMapping
    public List<Character> getCharacters() {
        return characterService.obtenerTodosLosPersonajes();
    }
    //este el endpoint obtener un personaje por id
    @GetMapping("/{id}")
    public Character getCharacterById(@PathVariable Long id) {
        return characterService.obtenerPersonajePorId(id);
    }
}