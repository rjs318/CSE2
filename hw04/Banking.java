// Rachel Shields
// CSE2 Professor Chen
// 2-13-15
//
//The Banking program gives the user a random amount of money in their bank
//account then asks them what they want to do: withdraw, deposit,
//or view their balance, then processes the transactions. 
import java.util.Scanner;
import java.util.Random;
    public class Banking{
        public static void main(String[] args){
            Scanner myScanner = new Scanner(System.in);
            //generates a random number between 1000 and 5000 and assigns it
            //to "balance$"
            double balance$ = Math.random() * (5001 - 1000) + 1000;
            //changes the balance to only have two numbers after the decimal
                balance$=(balance$*100);
                balance$=(int)balance$;
                balance$=balance$/100;
            System.out.println("**Welcome to CSE2 Bank**\n");//welcomes user to bank
            System.out.println("Your balance is: $"+balance$);//prints starting balance
            //gives user choice a of what to do (withdraw, deposit, view balance)
            System.out.println("Enter 1 if you want to deposit money into your account.");
            System.out.println("Enter 2 if you want to withdraw money from account.");
            System.out.println("Enter 3 if you would like to view your balance.");
            System.out.print("What would you like to do? ");
            int choice = myScanner.nextInt(); //reads in user input
            //checks for bad input
            if(choice!=1&&choice!=2&&choice!=3){
                System.out.println("Error: wrong input");
            }
            switch (choice){
                case 1: 
                    System.out.println("Enter how much would you like to deposit: ");
                    double deposit$ = myScanner.nextDouble();//reads in user input
                    //checks for bad input
                    if(deposit$<0){
                        System.out.println("You cannot deposit a negative amount of money.");
                    }
                    //calculates and prints new balance
                    else{
                        balance$=balance$+deposit$;
                        System.out.println("Your new balance is: $"+balance$);
                    }
                    break;
                case 2:
                    System.out.println("Enter how much would you like to withdraw: ");
                    double withdraw$ = myScanner.nextDouble();//reads in user input
                    //checks for bad input
                    if(withdraw$<0||withdraw$>balance$){
                        System.out.println("You cannot withdraw that amount.");
                    }
                    //calculates and prints new balance
                    else{
                        balance$=balance$-withdraw$;
                        System.out.println("Your new balance is: $"+balance$);
                    }
                    break;
                case 3:
                    System.out.println("Your balance is: $"+balance$);
                    break;
            }
            
            
        }//end of main method
        
    }//end of class