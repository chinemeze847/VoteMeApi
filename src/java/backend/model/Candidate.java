
package backend.model;

import java.io.Serializable;


public class Candidate implements Serializable 
{
    private String firstname;
    private String lastname;
    private String history;
    private String department;

    public Candidate(String firstname, String lastname,
            String history, String department) 
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.history = history;
        this.department = department;
    }
    
    public Candidate()
    {
     
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    
    
}
