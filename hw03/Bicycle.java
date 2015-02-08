//Rachel Shields
//CSE02 Professor Chen
//2-6-15
//Bicycle program prompts the user for number of counts on a cyclometer 
//and the number of seconds during which the counts occurred.
//The program then calculates and prints out the distance traveled 
//and the average miles per hour. 
import java.util.Scanner;
    public class Bicycle{
        public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the time elapsed in seconds: ");
        //above prompts user for time in sec
        int timeSec = myScanner.nextInt();//accepts user input
        System.out.print("Enter the number of counts"+
        "(The number of rotations of the wheel): ");//prompts user for counts
        int counts = myScanner.nextInt();//accepts user input
        double wheelDiameter=27.0, // constant value of the wheel's diameter
  	    PI=3.14159,// constant value assigned to pi for the calculations
  	    feetPerMile=5280,// constant for the number of feet in one mile
  	    inchesPerFoot=12,//constant for the number of inches in a foot 
  	    secondsPerMinute=60,//constant for the number of seconds in a minute
  	    minutesPerHour=60;//constant for the number of minutes in an hour
  	    double distanceTraveled=counts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
  	    //above calculates the distance traveled by the bicycle in miles
  	        double truncDistance=distanceTraveled*100;
            truncDistance=(int) truncDistance;
            truncDistance/=100;
        //above truncates the value for distanceTraveled to two decimal places
  	    double timeMin=timeSec/secondsPerMinute;//calculates time in minutes
  	    double timeHour=timeMin/minutesPerHour;
  	    double milesPerHour=distanceTraveled/timeHour;
  	        milesPerHour=milesPerHour*100;
            milesPerHour=(int) milesPerHour;
            milesPerHour/=100;
  	    //above calculates the average mph then truncates it 
  	    //at two decimal places
        System.out.println("The distance traveled was "+truncDistance+
        " miles and it took "+timeMin+" minutes."); 
        //above prints distance traveled and time elapsed in minutes
        System.out.println("The average mph was "+milesPerHour);
        //above prints out average mph
        }//end of main method
    }//end of class