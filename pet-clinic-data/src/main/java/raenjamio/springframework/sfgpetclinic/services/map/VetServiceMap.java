package raenjamio.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import raenjamio.springframework.sfgpetclinic.model.Speciality;
import raenjamio.springframework.sfgpetclinic.model.Vet;
import raenjamio.springframework.sfgpetclinic.services.CrudService;
import raenjamio.springframework.sfgpetclinic.services.SpecialitiesService;
import raenjamio.springframework.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	
	private final SpecialitiesService specialityService;
	
	
	public VetServiceMap(SpecialitiesService specialityService) {
		super();
		this.specialityService = specialityService;
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Vet save(Vet object) {
		
		if (object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach( spec -> {
				if (spec.getId() == null){
					Speciality savedSpeciality = specialityService.save(spec);
					spec.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save(object);
	}
	
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	
}
