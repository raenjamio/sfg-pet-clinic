package raenjamio.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import raenjamio.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
