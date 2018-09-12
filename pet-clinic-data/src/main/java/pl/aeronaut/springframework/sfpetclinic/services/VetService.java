package pl.aeronaut.springframework.sfpetclinic.services;

import pl.aeronaut.springframework.sfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
