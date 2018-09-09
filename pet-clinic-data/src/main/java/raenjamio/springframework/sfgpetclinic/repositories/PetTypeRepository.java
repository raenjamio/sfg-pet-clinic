package raenjamio.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import raenjamio.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
