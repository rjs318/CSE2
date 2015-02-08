//Rachel Shields
//CSE02 Professor Chen
//2-6-15
//The Root program prompts the user for a double, calculates a crude estimate
//of the cube root of the double, then prints the estimate and the value of
//the estimate when cubed
import java.util.Scanner;
    public class Root{
        public static void main(String[]args){
        Scanner myScanner= new Scanner(System.in);
        //prompts user for a double
        System.out.print("Enter a double and the cube root will be displayed: ");
        double input=myScanner.nextDouble();//accepts user input
        double guess=input/3;//first estimate of cube root of input
        guess=(2*guess*guess*guess+input)/(3*guess*guess);//improves estimate
        guess=(2*guess*guess*guess+input)/(3*guess*guess);//improves estimate
        guess=(2*guess*guess*guess+input)/(3*guess*guess);//improves estimate
        guess=(2*guess*guess*guess+input)/(3*guess*guess);//improves estimate
        guess=(2*guess*guess*guess+input)/(3*guess*guess);//improves estimate
        double cube=guess*guess*guess//calculates the value of the estimate cubed
        System.out.println("The cube root of "+input+"is "+guess+":");
        System.out.println(guess+"*"+guess+"*"+guess+" = "+cube);
        //above prints the estimate and the estimate cubed
        }//end of main method
    }//end of class