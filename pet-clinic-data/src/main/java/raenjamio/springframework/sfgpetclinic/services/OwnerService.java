package raenjamio.springframework.sfgpetclinic.services;

import raenjamio.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
