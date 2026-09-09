package service;

import model.Client;
import model.Person;
import model.Manager;

import java.util.Scanner;

class Auth {
    public static void signIn(){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("------ Nexa Bank -----");
        System.out.println("1 . manager");
        System.out.println("2 . client");
        System.out.println("3 . exit");

        System.out.print("=> ");
        int choise = 0;
        choise = sc.nextInt();

        if(choise == 1)
            System.out.println("regisred as manager");
        else if(choise == 2)
            System.out.println("regisred as client");
        else{ 
            System.out.println("chakatkhowr ><");
            return;
        }

        String firstname;
        String lastname;
        String email;
        String password;

        System.out.print("Enter ur first name : ");
        firstname = sc.nextLine();
        
        System.out.print("Enter ur last name : ");
        lastname = sc.nextLine();
        
        System.out.print("Enter ur email name : ");
        email = sc.nextLine();
        
        System.out.print("Enter ur password name : ");
        password = sc.nextLine();
        
        System.out.print("comfirm ur password : ");
        String comfirmPassword = sc.nextLine();
        if(choise == 1){
            Manager m1 = new Manager(firstname, lastname, email, password, "45678");
            m1.displayProfile();

            Person p1 = m1;
            p1.displayProfile();

        }else{
            Client c1 = new Client(firstname, lastname, email, password, "45678");

            c1.displayProfile();

            Person p1 = c1;
            p1.displayProfile();
        }
    }

    public static void signUp(){
        System.out.println("sign up");
    }
}

public class Menu {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
            
        System.out.println("------ Nexa Bank -----");

        int sChoise;
        do{
            System.out.println("1 . sign in");
            System.out.println("2 . sign up");
            System.out.println("3 . exit");
            System.out.print("=> ");
            sChoise = sc.nextInt();

            switch(sChoise){
                case 1:
                    Auth.signIn();
                    break;
                case 2:
                    Auth.signUp();
                    break;
                case 3:
                    System.out.println("thanks for visiting us :)");
                    break;
                default:
                    System.out.println("choise not found");
                    break; 
            }
        }while(sChoise != 3);
    }
}



// public class SignIn{
//     public void SignIn(){

//     }
// }