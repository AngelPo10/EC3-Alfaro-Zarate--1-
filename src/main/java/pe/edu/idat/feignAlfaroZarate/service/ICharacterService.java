package pe.edu.idat.feignAlfaroZarate.service;

import pe.edu.idat.feignAlfaroZarate.client.placeholder.iuserservice.Character;

import java.util.List;

public interface ICharacterService {
    List<Character> obtenerTodosLosPersonajes();
    Character obtenerPersonajePorId(Long id);
}