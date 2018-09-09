package raenjamio.springframework.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import raenjamio.springframework.sfgpetclinic.model.Owner;
import raenjamio.springframework.sfgpetclinic.model.Pet;
import raenjamio.springframework.sfgpetclinic.model.PetType;
import raenjamio.springframework.sfgpetclinic.model.Speciality;
import raenjamio.springframework.sfgpetclinic.model.Vet;
import raenjamio.springframework.sfgpetclinic.services.OwnerService;
import raenjamio.springframework.sfgpetclinic.services.PetTypeService;
import raenjamio.springframework.sfgpetclinic.services.SpecialtyService;
import raenjamio.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final OwnerService ownerService; 
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialitiesService;
	

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialitiesService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialitiesService = specialitiesService;
	}


	@Override
	public void run(String... args) throws Exception {
		
		int count = petTypeService.findAll().size();
		if (count == 0) {
			loadData();
		}
		
	}


	private void loadData() {
		PetType dog = new PetType();
		dog.setName("dog");
		PetType savedDogType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("cat");
		PetType savedCatType = petTypeService.save(cat);
		
		Speciality radiology = new Speciality();
		radiology.setDescription("radiology");
		Speciality savedRaiologySpeciality = specialitiesService.save(radiology);
		
		Speciality surgery = new Speciality();
		surgery.setDescription("surgery");
		Speciality savedSurgerySpeciality = specialitiesService.save(surgery);
		
		Speciality dentintry = new Speciality();
		dentintry.setDescription("radiology");
		Speciality savedDentintrySpeciality = specialitiesService.save(dentintry);
		
		

		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("Calle 2");
		owner1.setCity("Mataderos");
		owner1.setTelephone("42222222");
		/*
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("1231231234");
		*/
		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedDogType);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		owner1.getPets().add(mikesPet);
		 
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("Calle 1");
		owner2.setCity("Lugano");
		owner2.setTelephone("43333333");
		/*
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("1231231234");
		 */
		Pet fionasCat = new Pet();
		fionasCat.setName("Just Cat");
		fionasCat.setOwner(owner2);
		fionasCat.setBirthDate(LocalDate.now());
		fionasCat.setPetType(savedCatType);
		owner2.getPets().add(fionasCat);
		
		ownerService.save(owner2);
		/*
		Visit catVisit = new Visit();
		catVisit.setPet(fionasCat);
		catVisit.setDate(LocalDate.now());
		catVisit.setDescription("Sneezy Kitty");

		visitService.save(catVisit);
		 */
		System.out.println("Loaded Owners....");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vet1.getSpecialities().add(savedRaiologySpeciality);

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vet2.getSpecialities().add(savedSurgerySpeciality);


		vetService.save(vet2);

		System.out.println("Loaded Vets....");
	}

}
