package jpa.configuration;

import jpa.model.BlogModel;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<BlogModel,Integer> {
}
