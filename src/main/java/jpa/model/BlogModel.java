package jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
//@Table(name = "BlogPost", schema = "public", catalog = "frenzy")
public class BlogModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @NotNull(message = "Author name cannot be null")
    @NotBlank
    private String authorName;
    @NotNull(message = "BlogTitle name cannot be null")
    @NotBlank
    private String blogTitle;
    private String Country;

    public void setId(int id) {
        Id = id;
    }

    public BlogModel() {
    }
    @NotNull(message = "Post cannot be null")
    @NotBlank
    private String blogPost;

    public int getId() {
        return Id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "BlogModel{" +
                "Id=" + Id +
                ", authorName='" + authorName + '\'' +
                ", blogTitle='" + blogTitle + '\'' +
                ", Country='" + Country + '\'' +
                ", blogPost='" + blogPost + '\'' +
                '}';
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getBlogPost() {
        return blogPost;
    }

    public void setBlogPost(String blogPost) {
        this.blogPost = blogPost;
    }
}
