import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------ Nexa Bank  -----");
        
        int sChoise;
        do{
            System.out.println("1 . sign in");
            System.out.println("2 . sign up");
            System.out.println("3 . exit");
            System.out.print("=> ");
            sChoise = sc.nextInt();

            switch(sChoise){
                case 1:
                    
            }
        }while(sChoise != 3);
    }
}