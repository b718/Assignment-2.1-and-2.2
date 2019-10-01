import java.util.Scanner;
public class MarkDetector{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String mark = "";
        System.out.println("Mark Detector");

        System.out.println("-------------");

        System.out.println("What is your test out of?");
        double a = sc.nextDouble();

        System.out.println("What did you get on the test?");
        double b = sc.nextDouble();

        double c =  (double) b/a *100;
        int d = (int) c;
        //int d = (int) c;
        if( d > 100){
            mark = "A++";
            System.out.println("You got an " +mark+ " that's " + d + " %" +" , you're insane");

        }else if (d <= 100 && d >= 86){
            mark = "A";
            System.out.println("You got an " + mark + " that's " +d+ " %" +" , keep up the good work");

        } else if (d <= 85 && d >= 73){
            mark = "B";
            System.out.println("You got a " + mark + " that's " +d+ " %" +" , nothing wrong with it");

        } else if (d <= 72 && d >= 67){
            mark = "C+";
            System.out.println("You got a " + mark +" that's " +d + " %" + " , try harder");

        } else if (d <= 66 && d >= 60){
            mark = "C";
            System.out.println("You got a " + mark +" that's " +d + " %" + " , there's room for improvement");

        }else if (d <= 59 && d >= 50){
            mark = "C-";
            System.out.println("You got a " + mark +" that's " +d + " %" + " , are you even trying?");

        }else if (d <= 49 && d >= 1){
            mark = "F";
            System.out.println("You got a " + mark + " that's " +d+ " %" +" BEEP BOOP BEEP BOOP");

        } else {

            System.out.println("Please aquire a brain");
        }

    }
}
