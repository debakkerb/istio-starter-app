# Istio Sample Web Application

This is a sample application that is used by the Istio starter demo, stored in a separate repo.  First and foremost, this is not a tutorial on how to write and implement microservices or apply Domain Driven Design.  What I wanted to demonstrate with this tutorial is multiple pods that talk to each other and retrieve information from each other.

This codebase should not be used as an example to implement Spring Boot applications or how to implement security in applications.  There are much better articles and tutorials out there that teach you how to do this. 

What I want to achieve with this application is demonstrate how you can deploy a simple application, consisting of multiple pods and how to secure communication between all of them.  If you follow the official Istio documentation, you get a complete application out of the box, but I find it easier to unwrap a simple application, then a fully developed one.  It's easier to make small tweaks and watch the chaos unfold (or, hopefully, see those changes being reflected in the actual application successfully).

As you will see, quite a bit of code is being replicated everywhere.  As mentioned before, this isn't a showcase example of how things should be done, more a means to serve another purpose.

## Architecture

This application consists of 3 containers:
- Books
- Users
- Frontend

### Books
The purpose of this service is to return a list of book titles, together with author information and the number of pages in that book.

### Users
This service returns a list of users that have read books.  Nothing too fancy, just firstname, last name and email address.

### Frontend
This service introduces the frontend, which constists of a Spring Boot application that makes rest calls to the other services. 

## Versions
