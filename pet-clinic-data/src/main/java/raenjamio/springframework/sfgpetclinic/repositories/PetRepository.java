package raenjamio.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import raenjamio.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
