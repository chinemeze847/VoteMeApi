
package backend.service;

import backend.model.Student;
import backend.repository.StudentRepository;
import java.sql.*;
import java.util.List;


public class StudentService 
{
    StudentRepository repo;
    
    public StudentService()
    {
        repo = new StudentRepository();
    }
    
    public void saveStudent(Student student) throws ClassNotFoundException
    {
        try{
            repo.save(student);
            System.out.println("student served to the sevice class");
        }catch(Exception ex){
            ex.getMessage();
        } 
    }
    
    public List<Student> getUsers() throws ClassNotFoundException, SQLException
    {
        try{
            System.out.println("Retrieving users from database");
        }catch(Exception ex)
        {
            ex.getMessage();
        }
          return repo.findUsers();
    }
}
