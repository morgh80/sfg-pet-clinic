package pl.aeronaut.springframework.sfpetclinic.services;

import pl.aeronaut.springframework.sfpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
