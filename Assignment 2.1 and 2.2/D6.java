
import java.util.Scanner;
public class D6
{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Random Dice Generator");
        System.out.println("---------------------");

        System.out.println("Dice 1");
        double d1 = Math.random()*6+1;
        double d1a = (int) d1;
        //double d1a =(6*d1);

        System.out.println(d1a);

        System.out.println("Dice 2");
        double d2 = Math.random()*6 + 1;
        double d2a = (int) d2;

        System.out.println(d2a);

        System.out.println("Dice 3");
        double d3 = Math.random()*6 + 1;
        double d3a = (int) d3;

        System.out.println(d3a);

        System.out.println("Dice 4");
        double d4 = Math.random()*6 + 1;
        double d4a =(int) d4;

        System.out.println(d4a);

        System.out.println("Dice 5");
        double d5 = Math.random()*6 + 1;
        double d5a =(int)d5;
        System.out.println(d5a);

        System.out.println("Dice 6");
        double d6 = Math.random()*6+1;
        double d6a =(int)d6;

        System.out.println(d6a);
        
        System.out.println("Dice 7");
        double d7 = Math.random()*6+1;
        double d7a =(int)d7;

        System.out.println(d7a);
        
        System.out.println("Dice 8");
        double d8 = Math.random()*6+1;
        double d8a =(int)d8;

        System.out.println(d8a);
        
        System.out.println("Dice 9");
        double d9 = Math.random()*6+1;
        double d9a =(int)d9;

        System.out.println(d9a);
        
        System.out.println("Dice 10");
        double d10 = Math.random()*6+1;
        double d10a =(int)d10;

        System.out.println(d10a);
        

    }
}
