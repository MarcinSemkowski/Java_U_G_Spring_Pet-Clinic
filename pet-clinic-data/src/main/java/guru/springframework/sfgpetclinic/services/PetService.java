package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public interface PetService extends CrudService<Pet,Long> {


}
