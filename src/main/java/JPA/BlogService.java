package JPA;

import JPA.Configuration.BlogRepository;
import JPA.Model.BlogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;
    public List<BlogModel> getAllBlog()
    {
        return (List<BlogModel>) blogRepository.findAll();

    }
    public String saveMyblog(BlogModel curblog)
    {
        blogRepository.save(curblog);
        return "Blog Saved Successfully";
    }

}
