package raenjamio.springframework.sfgpetclinic.services.springdatadjpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import raenjamio.springframework.sfgpetclinic.model.Pet;
import raenjamio.springframework.sfgpetclinic.repositories.PetRepository;
import raenjamio.springframework.sfgpetclinic.services.PetService;

@Service
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }

}
