
package backend.model;

import java.io.Serializable;


public class Student  implements Serializable
{
    private int id;
    private String firstname;
    private String lastname;
    private String dept;
    private String matricNo;
    private String password;

    public Student(String firstname, String lastname,
            String dept, String matricNo, String password) 
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dept = dept;
        this.matricNo = matricNo;
        this.password = password;
    }

    public Student(int id, String firstname, 
            String lastname,
            String dept, 
            String matricNo, 
            String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dept = dept;
        this.matricNo = matricNo;
        this.password = password;
    }


    public Student()
    {     
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getFirstname() {
        return firstname;
    }

    public void setFirsname(String firsname) {
        this.firstname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getMatricNo() {
        return matricNo;
    }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
}
