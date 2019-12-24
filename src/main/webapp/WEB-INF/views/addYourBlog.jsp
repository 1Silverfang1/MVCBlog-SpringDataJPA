<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Student Form</title>
    <style>
        .error
        {
            color: red;
        }
    </style>
</head>
<body>
<span>
    ${processResult}
</span>

<%--@elvariable id="Blogger" type="JPA.Model.BlogModel"--%>
<form:form action="./create" modelAttribute="Blogger" method="post" autocomplete="off">
    Author Name: <form:input path="authorName" autocomplete="false"/>
    <form:errors path="authorName" /> <br>
    Blog Title: <form:input path="blogTitle" autocomplete="false"/>
    <form:errors path="blogTitle" /><br>
    Choose Your Country
    <form:select path="country">
        <form:option value="INDIA" label="IN"></form:option>
        <form:option value="PAKISTAN" label="PK"></form:option>
        <form:option value="GERMANY" label="GM"></form:option>
        <form:option value="UNITED STATES" label="USA"></form:option>
    </form:select>
    Create Your Blog
<form:textarea path="blogPost" ></form:textarea>
<input type="submit" value="Publish">
</form:form>
</body>
</html>
