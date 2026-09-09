package model;

public class Manager extends Person{
    private String managerId;

    public Manager(String firstName, String lastName, String email, String password, String managerId){
        super(firstName, lastName, email, password);
        this.managerId = managerId;
    }

    public void displayProfile(){
        System.out.println("name : " + getFirstName() + " id : " + managerId + " role : manager");
    }
}