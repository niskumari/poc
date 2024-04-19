package com.example.EmployeePOC.Model;


//import jakarta.persistence.*;


//@Entity
//@Table(name = "Persons")
public class Employee {

   // @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    int PersonID;
   // @Column(name="LastName")
    String lastName;
  //  @Column(name="FirstName")
    String firstName;


    public int getPersonID() {
        return PersonID;
    }

    public void setPersonID(int personID) {
        PersonID = personID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
