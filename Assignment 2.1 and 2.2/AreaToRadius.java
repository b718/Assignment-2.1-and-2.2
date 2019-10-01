import java.util.Scanner;

public class AreaToRadius
{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
           System.out.println("Circle Area Calculator");
           System.out.println("----------------------");
           
           System.out.println("Enter a radius");
           double a = sc.nextDouble();
           
           double b = Math.pow(a,2);
           double c = Math.PI; 
           System.out.println("Your area is " +  c*b );
            
        
        
        
        
    }

}
