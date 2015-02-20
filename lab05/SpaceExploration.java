//Rachel Shields
//CSE2 Professor Chen
//2-20-2015
//
//The Space Exploration program generates a random number in the range 2000-2010.
//The program then prints out a timeline of events in space exploration from 2000
//to the generated number.

public class SpaceExploration{
    public static void main(String[] args){
        int year = (int)(Math.random()*11)+2000;//generates random number between 1 and 10 inclusive
        System.out.println("The timeline of events in space exploration from 2000 "+
        "to "+year+" is as follows:");
        //prints out what occured in space exploration each year up to the generated year
        switch(year){
            case 2010:
                System.out.println("2010:SpaceX sucessfully sends spacecraft to orbit and back");
            case 2009:
                System.out.println("2009:N/A");    
            case 2008:
                System.out.println("2008:Kepler launched to study deep space");
            case 2007:
                System.out.println("2007:N/A");
            case 2006:
                System.out.println("2006:Spacecraft returns with collections from a comet");
            case 2005:
                System.out.println("2005:Spacecraft collides with comet");
            case 2004:
                System.out.println("2004:N/A");    
            case 2003:
                System.out.println("2003:Largest infrared telescope released");
            case 2002:
                System.out.println("2002:N/A");    
            case 2001:
                System.out.println("2001:First spacecraft lands on asteroid");
            case 2000:
                System.out.println("2000:First spacecraft orbits an asteroid");  
            
        }//end of switch statement
    }//end of main method
}//end of class