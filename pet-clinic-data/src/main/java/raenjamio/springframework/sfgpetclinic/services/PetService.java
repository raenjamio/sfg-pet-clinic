package raenjamio.springframework.sfgpetclinic.services;

import java.util.Set;

import raenjamio.springframework.sfgpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	Pet save(Pet owner);
	Set<Pet> findAll();
}
