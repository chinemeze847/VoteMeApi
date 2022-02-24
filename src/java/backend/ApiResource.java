
package backend;

import backend.model.Student;
import backend.service.StudentService;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.sql.*;
import java.util.List;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/api")
public class ApiResource {

    
    Jsonb jsonb;
    StudentService service;

    
    public ApiResource() 
    {
        jsonb = JsonbBuilder.create();
        service = new StudentService();
    }

    
    @Path("/students")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudents() throws ClassNotFoundException, SQLException 
    {
        List<Student> students = service.getUsers();
        return Response.ok(students).build();
    }
    
    @Path("/students/signup")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Student signup(@FormParam("matric_no") String matricNo,
            @FormParam("password") String password,
            @FormParam("firstname") String firstname,
            @FormParam("lastname") String lastname,
            @FormParam("dept") String dept ) throws ClassNotFoundException 
    {
        Student student = new Student(firstname,lastname,dept,matricNo,password);
        service.saveStudent(student);
        System.out.println("student successfully received in the api end point");
        return student;
    }
    
    @Path("/students/signin")
    @GET
    @Produces()
    public void signin(@FormParam("matric_no") String matricNo,
            @FormParam("password") String password)
    {
        
    }
    

}
