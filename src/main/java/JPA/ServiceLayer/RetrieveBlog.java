package JPA.ServiceLayer;

import JPA.Model.BlogModel;
import JPA.ServiceLayer.Interface.RetrieveInterface;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RetrieveBlog implements RetrieveInterface {
    @Override
    public List<BlogModel> getBlogData() {
        return null;
    }

    @Override
    public BlogModel getMyBlog(int myBlogId) {
        return null;
    }
//    @Autowired
//    private HibernateConfig configuration;
//
//    public HibernateConfig getConfiguration() {
//        return configuration;
//    }

//    public void setConfiguration(HibernateConfig configuration) {
//        this.configuration = configuration;
//    }
//   @Override
//    public List<BlogModel> getBlogData()
//    {
//
//        SessionFactory sessionFactory= configuration.getSessionFactory();
//        Session session= sessionFactory.openSession();
//        Transaction transaction= session.beginTransaction();
//        Query resultQuery=session.createQuery("from BlogModel");
//        List<BlogModel> blogModelArrayList= resultQuery.list();
//        return  blogModelArrayList;
//    }
//    @Override
//    public BlogModel getMyBlog(int myBlogId)
//    {
//        BlogModel blogModel= null;
//        SessionFactory sessionFactory= configuration.getSessionFactory();
//        Session session= sessionFactory.openSession();
//        Transaction transaction= session.beginTransaction();
//        blogModel=session.find(BlogModel.class,myBlogId);
//        transaction.commit();
//        session.close();
//        return  blogModel;
//    }
}
