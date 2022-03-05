package Calculator;
import java.util.Scanner;


public class Main {

    static double sumOfNumbers(double x , double  y){
        double ans = x + y;
        return ans ;
    }
    static double diffOfNumbers(double x , double  y){
        double ans = x - y;
        return ans ;
    }
    static double multiOfNumbers(double x , double  y){
        double ans = x * y;
        return ans ;
    }
    static double divOfNumbers(double x , double  y){
        double ans = x / y;
        return ans ;
    }

    public static void main(String[] args) {
        int operator; //for selecting the operator
        double input1,input2; // inputs for the calculations
        Scanner input = new Scanner(System.in); // to take user inputs

        System.out.println(" Hello !");
        System.out.println(" What you want to do ?");

        System.out.println("\n\n Press num 1 for sum");
        System.out.println(" Press num 2 for diff");
        System.out.println(" Press num 3 for multi");
        System.out.println(" Press num 4 for divid");

        System.out.println("\n Press your option....");
        operator = input.nextInt(); //for the operator

        switch (operator){ //select the operations
            case 1 :
                System.out.println("\n Enter number 1....");
                input1 = input.nextDouble();
                System.out.println("\n Enter number 2....");
                input2 = input.nextDouble();
                System.out.println("\n Answer is " + sumOfNumbers(input1,input2));
                break;

            case 2 :
                System.out.println("\n Enter number 1....");
                input1 = input.nextDouble();
                System.out.println("\n Enter number 2....");
                input2 = input.nextDouble();
                System.out.println("\n Answer is " + diffOfNumbers(input1,input2));
                break;
            case 3 :
                System.out.println("\n Enter number 1....");
                input1 = input.nextDouble();
                System.out.println("\n Enter number 2....");
                input2 = input.nextDouble();
                System.out.println("\n Answer is " + multiOfNumbers(input1,input2));
                break;

            case 4 :
                System.out.println("\n Enter number 1....");
                input1 = input.nextDouble();
                System.out.println("\n Enter number 2....");
                input2 = input.nextDouble();
                System.out.println("\n Answer is " + divOfNumbers(input1,input2));
                break;

            default: System.out.println("\n Invalid operator \n Try again !");
        }

    }
}
