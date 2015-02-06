//Rachel Shields
//CSE02 Professor Chen
//2-6-15
//
//The BigMac program reads input from the user regarding 
//how many Big Macs the user wants, the cost per Big Mac, and the percentage tax.
//The program then computes the total cost based on the user's input. 
import java.util.Scanner; //imports the scanner class so that it may be used in the program
    public class BigMac{
        public static void main(String[] args){
            Scanner myScanner;//declares instance of scanner object
            myScanner = new Scanner(System.in);
            System.out.print( "Enter the number of Big Macs(an integer > 0): "); //user enters number of Big Macs
            int nBigMacs = myScanner.nextInt();//user input accepted
            System.out.print("Enter the cost per Big Mac as"+"a double (in the form xx.xx):" );//user enters cost per BigMac
            double bigMac$ = myScanner.nextDouble();//user input accepted
	        System.out.print("Enter the percent tax as a whole number (xx): ");//user enter percent tax as a whole number
            double taxRate = myScanner.nextDouble();//user input accpeted
            taxRate/=100; //whole number percent that user entered is converted into a decimal 
            double cost$; 
            int dollars,//whole dollar amount of cost 
            dimes, pennies;//variables for storing digits after the decimal
            cost$ = nBigMacs*bigMac$*(1+taxRate); //calculates total cost of number of BigMacs including tax
            dollars=(int)cost$;
            dimes=(int)(cost$*10)%10; //modulus divison to get dime amount
            pennies=(int)(cost$*100)%10;//modulus division to get pennies amount
            System.out.println("The total cost of " +nBigMacs
            +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
            " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+"."+dimes+pennies); //prints total cost
        }//end of main method
        
    }//end of class