package JPA.ServiceLayer.Interface;

import JPA.Model.BlogModel;

import java.util.List;

public interface RetrieveInterface {
    List<BlogModel> getBlogData();
    BlogModel getMyBlog(int myBlogId);
}
