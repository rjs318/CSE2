// Rachel Shields
// CSE2 Professor Chen
// 2-13-15
//
//The user is going to a party and is bringing cookies. The Cookies program 
//prompts the user for the number of people at the party, how many cookies
// the user plans on buying, and how many cookies they would like each
//person to get. Using the user input, the program calculates: if the user has
//enough cookies, if the number of people divides evenly into the number of cookies
//and how many more cookies are needed if the user does not have enough.
import java.util.Scanner;
    public class Cookies{
   			public static void main(String[] args) {
   			Scanner myScanner = new Scanner(System.in);
   			int numpeople;
   			int numCookies;
   			int numGive;
   			//prompts user for number of people
   			System.out.print("Enter the number of people: ");
   			//checks if the user input is an integer, if input is an
   			//integer, it is assigned to the variable "numpeople"
   			//if the input is not an integer, the program quits.
   			if(myScanner.hasNextInt()){
   			    numpeople = myScanner.nextInt();
   			}
   			else{
   			    System.out.println("You did not enter an int");
   			    return; //program quits
   			}
   			//checks if the number of people entered is less than 0
   			//if so, the user is notified and the program quits.
   			if(numpeople<0){
   			    System.out.println("The int you entered is not greater than 0");
   			    return;
   			}
   			//prompts user for how many cookies they plan to buy
   			System.out.print("How many cookies do you plan on buying: ");
   			//checks if user input is int, if so it is assigned to "numCookies"
   			//if the input is not an integer, the program quits.
   			if(myScanner.hasNextInt()){
   			    numCookies = myScanner.nextInt();
   			}
   			else{
   			    System.out.println("You did not enter an int");
   			    return; //program quits
   			}
   			//checks if the number of cookies entered is less than 0
   			//if so, the user is notified and the program quits.
   			if(numCookies<0){
   			    System.out.println("The int you entered is not greater than 0");
   			    return;
   			}
   			System.out.print("How many cookies would you like each person to get: ");
   			//checks if user input is int, if so it is assigned to "numGive"
   			//if the input is not an integer, the program quits.
   			if(myScanner.hasNextInt()){
   			    numGive = myScanner.nextInt();
   			}
   			else{
   			    System.out.println("You did not enter an int");
   			    return; //program quits
   			}
   			//checks if the number of cookies entered is less than 0
   			//if so, the user is notified and the program quits.
   			if(numCookies<0){
   			    System.out.println("The int you entered is not greater than 0");
   			    return;
   			    }
   			//tests if the user has enough cookies for each person
   			//tests whether or not the number of people divides evenly into
   			//the number of cookies
   			if(numpeople*numGive<=numCookies){
   			    if(numCookies%numpeople==0){
   			        System.out.println("You have enough cookies and the "+
   			        "amount divides evenly.");
   			    }
   			    else{
   			        System.out.println("You have enough cookies but the "+
   			        "amount does not divide evenly.");
   			    }
   			}
   			//if the user does not have enough cookies for each person the
   			//program test for how many more cookies the user needs
   			else{
   			    int moreCookies = numpeople*numGive-numCookies;
   			    //above calculates how many more cookies are needeed
   			    System.out.println("You do not have enough cookies! "+
   			    "You need at least "+moreCookies+" more cookie(s)!");
   		    }
   		
}  //end of main method   
  	} //end of class