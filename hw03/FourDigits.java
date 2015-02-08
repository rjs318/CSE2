//Rachel Shields
//CSE02 Professor Chen
//2-6-15
// The FourDigits program prompts the user to enter a double and  
//then prints out the first four digits to the right of the decimal point
//of that number
import java.util.Scanner;
    public class FourDigits{
        public static void main(String[] args){
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter a double, and the four digits to the right"+
            " of the decimal will be displayed: "); //prompts user for double
            double input = myScanner.nextDouble();//user input accpeted
            int divisor = (int)input*10000;//multiplies integer form of
            //the input by 10000 and stores it in the variable "divisor"
            input=input*10000;//multiplies input by 10000 and stores the result in
            //the input variable
            int afterDec = (int)input%divisor;//Divides the input by the divisor 
            //and stores the remainder in the variable "afterDec." 
            int digOne = afterDec/1000;//finds 1st digit of the four 
            afterDec=afterDec%1000;
            int digTwo =afterDec/100;//finds 2nd digit of the four
            afterDec=afterDec%100;
            int digThree =afterDec/10;//finds 3rd digit of the four
            afterDec=afterDec%10;
            int digFour=afterDec/1;//finds 4th digit of the four
            System.out.println("The four digits to the right of the decimal are: "
            +digOne+digTwo+digThree+digFour); //prints four digits after decimal
        }//end of main method
    }//end of class