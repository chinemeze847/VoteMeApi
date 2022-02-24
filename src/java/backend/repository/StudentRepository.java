/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.repository;

import backend.db.DbConnection;
import backend.model.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StudentRepository 
{
    private DbConnection dbConn;
    private List<Student> students;
    
    public StudentRepository()
    {     
       dbConn = new DbConnection();
       students = new ArrayList();
    }
    
    
    public  void save(Student student) throws ClassNotFoundException
    {
        
        try(Connection conn = dbConn.connect())
        {
            String sql = "INSERT INTO students(firstname,lastname,dept,matric_no,password) VALUES(?,?,?,?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, student.getFirstname());
            stmt.setString(2,student.getLastname());
            stmt.setString(3,student.getDept());
            stmt.setString(4,student.getMatricNo());
            stmt.setString(5,student.getPassword());
            stmt.executeUpdate();
            System.out.println("student inserted in database");
        }catch(SQLException ex)
        {
            ex.getMessage();
        }
        
    }
    
    public List<Student> findUsers()throws ClassNotFoundException, SQLException
    {
         
        ResultSet result ;
        int id;
        String fn;
        String ln;
        String matricNo;
        String dept;
        String pswd;
        
        try(Connection conn = dbConn.connect())
        {
            //Creating the Statement
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM students";
            
            result = stmt.executeQuery(sql);  
            
            while(result.next())
            {
                id = result.getInt("id");
                fn = result.getString("firstname");
                ln = result.getString("lastname");
                matricNo = result.getString("matric_no");
                dept = result.getString("dept");
                pswd  = result.getString("password");
                
                students.add(new Student(id,fn,ln,dept,matricNo,pswd));
            }
        }catch(Exception ex)
        {
            ex.getMessage();
        }
        
        return students;
    }
    
    
   
}
