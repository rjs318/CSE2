//Rachel SHields
//CSE002 Professor Chen
//1-30-2015
// The Cyclometer program records the time elapsed in seconds
// and the number of rotations of the front wheel of a bicycle during
// that time. 
// Given the time and rotation count for two trips,
//  The program then prints:
//      the number of minutes for each trip
//      the number of counts for each trip
//      the distance of each trip in miles
//      the distance for the two trips combined
//
public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    //input data
   	    int secsTrip1=480;    //The time elapsed in seconds in the first trip
       	int secsTrip2=3220;   //The time elapsed in seconds in the second trip
		int countsTrip1=1561; //The number of rotations of the wheel in the first trip
		int countsTrip2=9037; //The number of rotations of the wheel in the second trip
		//intermediate values and output 
		double wheelDiameter=27.0,  // constant value of the wheel's diameter
  	    PI=3.14159, // constant value assigned to pi for the calculations
  	        feetPerMile=5280,  // constant for the number of feet in one mile
  	        inchesPerFoot=12,   //constant for the number of inches in a foot 
  	        secondsPerMinute=60;  //constant for the number of seconds in a minute
	    double distanceTrip1, distanceTrip2,totalDistance;  //declaration of the
	    //variables that will hold the results of the calculations of the distances
	    //for trips one and two, as well as the distance for the two trips combined
	    System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts."); 
       	    // above calculates the number of minutes each trip took and prints the result
        	// also prints the value stored in the variable 'countsTrip1'
	   System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
            // above calculates the number of minutes each trip took and prints the result
        	// also prints the value stored in the variable 'countsTrip1'
       	distanceTrip1=countsTrip1*wheelDiameter*PI;
       	// Above calculates the distance traveled in trip one,
       	//in inches, by multiplying the number of rotations
       	//of the wheel for the trip by the circumference of the wheel
       	// then stores the result in the variable 'distanceTrip1'
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	    distanceTrip1/=inchesPerFoot*feetPerMile;
	    //above converts distance in inches to distance in miles and stores the value in 'distanceTrip1'
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	    //above does the same calculations as the previous statements but in a shortened version
	    totalDistance=distanceTrip1+distanceTrip2; //calculates total distance from both trips
	    //prints the output values
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");
   	}  //end of main method   
} //end of class

