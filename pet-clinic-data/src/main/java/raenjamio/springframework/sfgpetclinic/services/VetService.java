package raenjamio.springframework.sfgpetclinic.services;

import java.util.Set;

import raenjamio.springframework.sfgpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
