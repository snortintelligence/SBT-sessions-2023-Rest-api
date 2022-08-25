REST API
--------
REST stands for representational state transfer and was created by computer scientist Roy Fielding.
REST is a set of architectural constraints, not a protocol or a standard.
When a client request is made via a RESTful API, it transfers a representation of the state of the resource to the endpoint.
This information, or representation, is delivered in one of several formats via HTTP: JSON (Javascript Object Notation), HTML, XLT, Python, PHP, or plain text. 

JSON is the most generally popular file format to use because, despite its name, it’s language-independant, as well as readable by both humans and machines.

What is TODOs? 
A list of tasks – often written on a piece of paper as a memory aid – that one needs or intends to accomplish.

-------------------------------------------------------------------------------------------
Follows to create Todos rest api in Spring Boot application 
-------------------------------------------------------------------------------------------
1. Create rest-api for TODO application 
2. Create layers meant java packages
[ 
    a. model - It represents (POJO) plain old java object to a store task information. 
    b. repository - It represents database object to perform database operations (CRUD) 
    c. controller - It accepts client requests , process it and genarte response to send  back to the client.  
    d. exception - Exception raised when any method execution failed or generate error  
] 
3. Add functionalities to create | update | delete | find | findAll todos 
4. Configure server Port 
5. Use logging to print any messages / info 
6. Test the rest api using POSTMAN Tool - 
       import SBT-TodosApplication-Rest-api.postman_collection.json into POSTMAN

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
