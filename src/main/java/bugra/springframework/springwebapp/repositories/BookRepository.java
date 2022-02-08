package bugra.springframework.springwebapp.repositories;

import bugra.springframework.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {


}
