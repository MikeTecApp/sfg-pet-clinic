package guru.springframwork.sfgpetclinic.services.map;

import guru.springframwork.sfgpetclinic.model.Owner;
import guru.springframwork.sfgpetclinic.services.CrudService;


import java.util.Set;

public class OwnerServiceMap extends AbestractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return this.findAll();
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);

    }

    @Override
    public void delete(Owner object) {
        this.delete(object);

    }

    @Override
    public Owner save(Owner object) {
        return this.save(object);
    }

    @Override
    public Owner findById(Long id) {
        return this.findById(id);
    }
}
