package repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import domain.Form;

public interface FormRepository extends CrudRepository<Form, Long>{
	
    List<Form> findByLastName(String lastName);

}

