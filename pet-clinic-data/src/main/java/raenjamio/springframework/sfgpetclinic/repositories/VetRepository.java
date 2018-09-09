package raenjamio.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import raenjamio.springframework.sfgpetclinic.model.Speciality;
import raenjamio.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
