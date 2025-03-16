package pe.edu.idat.feignAlfaroZarate.service;


import org.springframework.stereotype.Service;
import pe.edu.idat.feignAlfaroZarate.client.placeholder.iuserservice.Character;
import pe.edu.idat.feignAlfaroZarate.client.placeholder.iuserservice.CharacterClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CharacterServiceImpl implements ICharacterService {
    private final CharacterClient characterClient;

    public CharacterServiceImpl(CharacterClient characterClient) {
        this.characterClient = characterClient;
    }

    @Override
    public List<Character> obtenerTodosLosPersonajes() {
        Map<String, Object> response = characterClient.obtenerPersonajes();
        List<Map<String, Object>> results = (List<Map<String, Object>>) response.get("results");

        List<Character> personajes = new ArrayList<>();
        for (Map<String, Object> personajeData : results) {
            Character personaje = new Character();
            personaje.setId(((Number) personajeData.get("id")).longValue());
            personaje.setName((String) personajeData.get("name"));
            personaje.setStatus((String) personajeData.get("status"));
            personaje.setSpecies((String) personajeData.get("species"));
            personaje.setImage((String) personajeData.get("image"));

            personajes.add(personaje);
        }
        return personajes;
    }

    @Override
    public Character obtenerPersonajePorId(Long id) {
        return characterClient.obtenerPersonajePorId(id);
    }
}