/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinputloginpt.pkg1;

/**
 *
 * @author RC_Student_lab
 */
public class Regisration {
    
    public String firstName;
    public String lastName;
    public String userName;
    public String password;
    
    //default consructors

    public Regisration() {
        this.firstName = "";
        this.lastName = "";
        this.userName = "";
        this.password ="";
    }
    
    //getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    //setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
}
