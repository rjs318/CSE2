//Rachel Shields
//CSE2 Professor Chen
//2-27-15
//The RunFactorial program prompts the user for an integer
//between 9 and 16 inclusive. The program then calculates and 
//prints the factorial of the input.
import java.util.Scanner;
public class RunFactorial{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number between 9 and 16: ");
        boolean badInput=true; //value to hold whether user input is acceptable or not
        int input=0;
        //tests for bad input and asks for input until a correct value is entered
        while(badInput){
            if (myScanner.hasNextInt()){ //tests if the input is an integer
            badInput=false; //if the input is an integer it is not a bad value
            input=myScanner.nextInt();
            //the input is then tested to see whether or not it is negative
                while(input<0||input<9||input>16){//if input is negative, or not between 9 and 16
                //it is a bad value and an error is printed
                    System.out.print("Invalid input, enter a positive integer: ");
                    if(!myScanner.hasNextInt()){//if the user inputs something that is not
                    //an integer, it is a bad value and an error is printed
                        myScanner.next();
                    }
                    else{
                        input=myScanner.nextInt();
                    }
                }
            }
        }
        System.out.println(input+"! is equal to: ");
        double factorial = 1;
        //calculates the factorial of the input
        while(input!=0){
            factorial*=input;
            input--;
        }
        //prints factorial
        System.out.println(factorial);
    }//end of main method
}//end of class