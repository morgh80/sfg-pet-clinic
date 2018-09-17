package pl.aeronaut.springframework.sfpetclinic.services;

import pl.aeronaut.springframework.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String name);

}
