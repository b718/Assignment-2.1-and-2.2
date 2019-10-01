import java.util.Scanner;

public class DistFormula
{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Distance Formula");
        System.out.println("----------------");
        
        System.out.println("Give a number for X1");
        int a1 = sc.nextInt();
        System.out.println("Give a number for X2");
        int a2 = sc.nextInt();
        System.out.println("Give a number for Y1");
        int b1 = sc.nextInt();
        System.out.println("Give a number for Y2");
        int b2 = sc.nextInt();
        
        double c1 = (a2-a1);
        double c1a = Math.pow(c1,2);
        
        double c2 = (b2-b1);
        double c2a = Math.pow(c2,2);
        
        double d = Math.sqrt(c1a + c2a);
        
        System.out.println("Your Distance is " + d);
        
        
        
        
    }

}
