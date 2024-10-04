/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author NATE
 */
public class User {
     private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private String patienttype;
    private String email; // Add email field

    // Update the constructor to accept email
    public User(String firstname, String lastname, String email, String gender, String patienttype, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.patienttype = patienttype;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email; // Getter for email
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPatienttype() {
        return patienttype;
    }

    // Example method
    void someFunction() {
        System.out.println("FirstName: " + firstname);
    }
}


