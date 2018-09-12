package pl.aeronaut.springframework.sfpetclinic.services;

import pl.aeronaut.springframework.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
