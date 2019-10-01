import java.util.Scanner;
//A = P(1 + r)^n
public class SimpleInterestFormula
{
       public static void main(String[] arg){
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Simple Interest Formula");
           System.out.println("-----------------------");
           
           System.out.println("How much would you like to invest");
           int P = sc.nextInt();
          System.out.println("What is your interest rate?");
          int r = sc.nextInt();
          
          System.out.println("How many years is this going to last?");
          int n = sc.nextInt();
          double c = r/100;
          double a = (1 + c);
          
          double a1 = (P * a);
          
          double a2 = Math.pow(a1,2);
          
          
          
           System.out.println("This is how much wealth you gain " + a2);


           
           
           

           
           
           
           
           
           
        }
}
