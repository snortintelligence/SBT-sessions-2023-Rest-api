# SBT-TodosApplication-Rest-api
REST API
--------
REST stands for representational state transfer and was created by computer scientist Roy Fielding.
REST is a set of architectural constraints, not a protocol or a standard.
When a client request is made via a RESTful API, it transfers a representation of the state of the resource to the endpoint.
This information, or representation, is delivered in one of several formats via HTTP: JSON (Javascript Object Notation), HTML, XLT, Python, PHP, or plain text. 

JSON is the most generally popular file format to use because, despite its name, it’s language-independant, as well as readable by both humans and machines.

keep in mind: Headers and parameters are also important in the HTTP methods of a RESTful API HTTP request, as they contain important identifier information as to the request's metadata, authorization, uniform resource identifier (URI), caching, cookies, and more. There are request headers and response headers, each with their own HTTP connection information and status codes.

In order for an API to be considered RESTful, it has to conform to these criteria:
    
    1. A client-server architecture made up of clients, servers, and resources, with  requests managed through HTTP.
    2. Stateless client-server communication, meaning no client information is stored between get requests and each request is separate and unconnected.
    3. Cacheable data that streamlines client-server interactions.
    4. A uniform interface between components so that information is transferred in a standard form. This requires that:

            * resources requested are identifiable and separate from the representations  sent to the client.
            * resources can be manipulated by the client via the representation they receive because the representation contains enough information to do so.
            * self-descriptive messages returned to the client have enough information to describe how the client should process it.
            * hypertext/hypermedia is available, meaning that after accessing a resource the client should be able to use hyperlinks to find all other currently available actions they can take.

    5. A layered system that organizes each type of server (those responsible for security, load-balancing, etc.) involved the retrieval of requested information into hierarchies, invisible to the client.
    6. Code-on-demand (optional): the ability to send executable code from the server to the client when requested, extending client functionality. 

Though the REST API has these criteria to conform to, it is still considered easier to use than a prescribed protocol like SOAP (Simple Object Access Protocol).

What is TODOs? 
A list of tasks – often written on a piece of paper as a memory aid – that one needs or intends to accomplish.

-------------------------------------------------------------------------------------------
Follows to create Todos rest api in Spring Boot application 
-------------------------------------------------------------------------------------------
1. Create rest-api for TODO application 
Create layers meant java packages
[ 
    a. model - It represents (POJO) plain old java object to a store task information. 
    b. repository - It represents database object to perform database operations (CRUD) 
    c. controller - It accepts client requests , process it and genarte response to send  back to the client.  
    d. exception - Exception raised when any method execution failed or generate error  
] 
2. Add functionalities to create | update | delete | find | findAll todos 
3. Configure server Port 
4. Use logging to print any messages / info 
5. Test the rest api using POSTMAN 

Todo - JSON Object

{
        "taskId": 101,
        "title": "Create UI Page",
        "description": "Create user registration page.",
        "completed": false,
        "assignedDate": "2022-08-25T17:26:09.653+00:00",
        "updatedDate": null
}
-------------------------------------------------------------------------------------------
