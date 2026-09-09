package model;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public Person(String firstName, String lastName, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getEmail(){return email;}

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    

    public void changePassword(String password){
        this.password = password;
    }

    public boolean verifyPassword(String password){
        return this.password.equals(password);
    }

    public abstract void displayProfile();
} 