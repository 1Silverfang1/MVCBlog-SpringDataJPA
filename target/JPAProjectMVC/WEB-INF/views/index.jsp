
<%@ page import="java.util.ArrayList" %>
<%@ page import="JPA.Model.BlogModel" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>This is your new homepage</title>
</head>
<body>
Hey This is your HomePage
All the Form Submitted data will be shown here.
<a href="">Click here for Homepage</a>
<hr>
<a href="post/create">Click here to add Form</a>
<hr>
<%
    ArrayList<BlogModel> result= (ArrayList<BlogModel>) request.getAttribute("BlogData");
    for(BlogModel curBlog: result)
    {
%>
<h2><a href="post/view/<%=curBlog.getId()%>"><%=curBlog.getAuthorName()%></a></h2>
<h3><%=curBlog.getAuthorName()%></h3>
<% String blog = curBlog.getBlogPost();
String blogExcrept="";
if(blog.length()>50)
{
   blogExcrept = blog.substring(0,49);
}
else
{
    blogExcrept=blog;
}
%>
<p><%=blogExcrept%></p>
<form action="post/delete/<%=curBlog.getId()%>"  method="get">

    <input type="submit" value="Delete">
</form>
<form action="post/update/<%=curBlog.getId()%>" method="get">
    <input type="submit" value="Edit">
</form>
<hr>
<%
    }
%>

<br>

</body>
</html>
