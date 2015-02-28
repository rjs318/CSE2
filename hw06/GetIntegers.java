//Rachel Shields
//CSE2 Professor Chen
//2-27-15
//
//The GetIntegers program prompts the users for 5 non-negative integers
//then calculates and printes the sum of the 5 integers. If bad input is entered,
//the program will continue to ask for input until a correct value is entered.
import java.util.Scanner;
public class GetIntegers{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter 5 non-negative integers: ");
        boolean badInput=true; //value to hold whether user input is acceptable or not
        int a=0; //a is the first integer
        System.out.print("Integer One: ");
        //continuously tests for bad input and asks for input until a correct value is entered
        while(badInput){
            if (myScanner.hasNextInt()){ //tests if the input is an integer
            badInput=false; //if the input is an integer it is not a bad value
            a=myScanner.nextInt();
            //the input is then tested to see whether or not it is negative
                while(a<0){//if input is negative, it is a bad value and an error is printed
                    System.out.print("Invalid input, enter a positive integer: ");
                    if(!myScanner.hasNextInt()){//if the user inputs something that is not
                    //an integer, it is a bad value and an error is printed
                        myScanner.next();
                    }
                    else{
                        a=myScanner.nextInt();
                    }
                }
            }
            else if(!myScanner.hasNextInt()){//if the user enters something that is not
            //an integer, an error is printed 
                  System.out.print("Invalid input, enter a positive integer: ");
                  myScanner.next();
            }
        }
        badInput=true; //badInput value is reset to true for the next integer checking process
        //***
        //the entire process above is repeated below for the next four integers (b,c,d,e)
        //***
        int b=0;//b is the second integer
        System.out.print("Integer Two: ");
        while(badInput){
            if (myScanner.hasNextInt()){
            badInput=false;
            b=myScanner.nextInt();
                while(b<0){
                    System.out.print("Invalid input, enter a positive integer: ");
                    if(!myScanner.hasNextInt()){
                        myScanner.next();
                    }
                    else{
                        b=myScanner.nextInt();
                    }
                }
            }
            else if(!myScanner.hasNextInt()){
                  System.out.print("Invalid input, enter a positive integer: ");
                  myScanner.next();
            }
        }
        badInput=true;
        int c=0;//c is the third integer
        System.out.print("Integer Three: ");    
        while(badInput){
            if (myScanner.hasNextInt()){
            badInput=false;
            c=myScanner.nextInt();
                while(c<0){
                    System.out.print("Invalid input, enter a positive integer: ");
                    if(!myScanner.hasNextInt()){
                        myScanner.next();
                    }
                    else{
                        c=myScanner.nextInt();
                    }
                }
            }
            else if(!myScanner.hasNextInt()){
                  System.out.print("Invalid input, enter a positive integer: ");
                  myScanner.next();
            }
        }
        badInput=true;
        int d=0;//d is the fourth integer
        System.out.print("Integer Four: ");
        while(badInput){
            if (myScanner.hasNextInt()){
            badInput=false;
            d=myScanner.nextInt();
                while(d<0){
                    System.out.print("Invalid input, enter a positive integer: ");
                    if(!myScanner.hasNextInt()){
                        myScanner.next();
                    }
                    else{
                        d=myScanner.nextInt();
                    }
                }
            }
            else if(!myScanner.hasNextInt()){
                  System.out.print("Invalid input, enter a positive integer: ");
                  myScanner.next();
            }
        }
        badInput=true;
        int e=0;//e is the fifth integer
        System.out.print("Integer Five: ");
        while(badInput){
            if (myScanner.hasNextInt()){
            badInput=false;
            e=myScanner.nextInt();
                while(e<0){
                    System.out.print("Invalid input, enter a positive integer: ");
                    if(!myScanner.hasNextInt()){
                        myScanner.next();
                    }
                    else{
                        e=myScanner.nextInt();
                    }
                }
            }
            else if(!myScanner.hasNextInt()){
                  System.out.print("Invalid input, enter a positive integer: ");
                  myScanner.next();
            }
        }
        System.out.println("Your acceptable intput for the integers is: "+
        a+", "+b+", "+c+", "+d+", "+e);//reminds the user of their correct inputs
        int sum = a+b+c+d+e; //calculates the sum of the integers
        System.out.println("The sum of those 5 integers is: "+sum);//prints sum
    }//end of main method
}//end of class