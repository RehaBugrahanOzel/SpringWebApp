package bugra.springframework.springwebapp.repositories;

import bugra.springframework.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

    
}
