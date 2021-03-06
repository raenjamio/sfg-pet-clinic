package raenjamio.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import raenjamio.springframework.sfgpetclinic.model.Speciality;
import raenjamio.springframework.sfgpetclinic.services.SpecialtyService;

@Service
@Profile({"default", "map"})
public class SpecialitiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtyService{

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}
	
	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
