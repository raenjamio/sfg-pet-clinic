package raenjamio.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import raenjamio.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
