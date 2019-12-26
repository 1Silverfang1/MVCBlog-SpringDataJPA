package jpa.serviceLayer;

import jpa.model.BlogModel;

import java.util.List;
import java.util.Optional;

public interface ServiceInterface {
    public List<BlogModel> getAllBlog();
    public String saveMyblog(BlogModel curblog);
    public Optional<BlogModel> viewBlog(int id);
    public String deleteThisBlog(int id);
}
