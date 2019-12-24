package JPA.Configuration;

import JPA.Model.BlogModel;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<BlogModel,Integer> {
}
