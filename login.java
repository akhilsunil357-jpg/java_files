import java.util.Scanner;

public class login {

    

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String username = "Admin";
        String passward = "Java123";

        System.out.println("Enter Your Name");
        String Name = input.nextLine();

        System.out.println("Enter Your Passward");
        String Pass = input.nextLine();

        if (Name.equals(username) && Pass.equals(passward)){
            System.out.println("Welcome user");

        }else{
            System.out.println("Wrong passward");
        }



    }
    
}
