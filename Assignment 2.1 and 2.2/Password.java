import java.util.Scanner;
public class Password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Password keeper");
        System.out.println("---------------");

        System.out.println("Whats the password?");
        String password = sc.nextLine();

        if (password.equals("dragon")){
            System.out.println("Great, my secret is I'm scary");
        } else {
            System.out.println("Error, Bye !");
        }
    }
}
