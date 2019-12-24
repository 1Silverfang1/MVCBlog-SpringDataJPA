package JPA;

import JPA.Configuration.BlogRepository;
import JPA.Model.BlogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private BlogRepository blogRepository;
    public List<BlogModel> getAllBlog()
    {
        return (List<BlogModel>) blogRepository.findAll();

    }

}
