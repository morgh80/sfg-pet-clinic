package pl.aeronaut.springframework.sfpetclinic.services.map;

import pl.aeronaut.springframework.sfpetclinic.model.Owner;
import pl.aeronaut.springframework.sfpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deletById(Long id) {
        super.deleteById(id);
    }
}
