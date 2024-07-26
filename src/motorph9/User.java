/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph9;

/**
 *
 * @author Shekinah Jabez
 */
public class User {
    private String username;
    private String firstName;
    private String employeeId;

    public User(String username, String firstName, String employeeId) {
        this.username = username;
        this.firstName = firstName;
        this.employeeId = employeeId;
    }

    public User() {
        
      
    }
    public void setFirstname(String firstName){
        this.firstName = firstName;
    }
    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }    
    public String getEmployeeId() {
        return employeeId;
    }
    
}   
    
