//Rachel Shields
//CSE2 Professor Chen
//2-20-15
//
//The ToHex program prompts the user for three numbers corresponding to 
//RGB values. The program then converts the numbers into hexadecimal values.
import java.util.Scanner;
    public class ToHex{
        public static void main(String[] args){
            Scanner myScanner = new Scanner(System.in);
            //lets user know they will be entering RGB values
            System.out.println("Please enter three integer numbers (0-255) that correspond"+
            "to RGB values.");
            String totalHex =""; //stores total hexadecimal value
            //
            //Red
            //
            System.out.print("R: ");//prompts user for red value
            //tests for input that is not an integer, prints error if input is not integer
            if (!myScanner.hasNextInt()){
                System.out.println("Incorrect input, input must be an integer");
                return;
            }
            int rVal = myScanner.nextInt(); //rVal is equal to integer entered as the R value
            //tests if rVal is between 0 and 255, prints error if rVal is not between 0 and 255
            if (rVal<0||rVal>255){
                System.out.println("Incorrect input, please make sure that "+
                "the integer values are between 0 and 255 inclusive");
                return;
            }
            int rHex1=(rVal/16); //finds first part of integer as hexadecimal
            int rHex2=rVal%16; //finds second part of integer as hexadecimal
            //declares Strings rStr1 and rStr2 in case the value of
            //one of the integers is a letter in hexadecimal (10-15 inclusive have letter representations)
            String rStr1="";
            String rStr2="";
            //declares String rHexTotal to hold the hexadecimal of the Red RGB value
            String rHexTotal="";
            switch(rHex1){
                case 10: rStr1="A"; //if rHex1 is equal to 10, it is equal to A in hexadecimal
                break;
                case 11: rStr1="B";//if rHex1 is equal to 11, it is equal to B in hexadecimal
                break;
                case 12: rStr1="C";//if rHex1 is equal to 12, it is equal to C in hexadecimal
                break;
                case 13: rStr1="D";//if rHex1 is equal to 13, it is equal to D in hexadecimal
                break;
                case 14: rStr1="E";//if rHex1 is equal to 14, it is equal to E in hexadecimal
                break;
                case 15: rStr1="F";//if rHex1 is equal to 10, it is equal to F in hexadecimal
                break;
            }
            switch(rHex2){  //same process as with switch(rHex1) but with rHex2
                case 10: rStr2="A"; 
                break;
                case 11: rStr2="B"; 
                break;
                case 12: rStr2="C";
                break;
                case 13: rStr2="D";
                break;
                case 14: rStr2="E";
                break;
                case 15: rStr2="F";
                break;
            }
            if(rStr1.equals("")==false&&rStr2.equals("")==false){//if both hex values are letters
                rHexTotal=(rStr1+rStr2); //red hex value as String
            }
            else if(rStr1.equals("")==false&&rStr2.equals("")){//if the first hex value is a letter and the second is an int
                rHexTotal=(rStr1+""+rHex2);//red hex value as String
            }
            else if(rStr1.equals("")&&rStr2.equals("")==false){//if the first hex value is an int and the second is a letter
                rHexTotal=(""+rHex1+rStr2);//red hex value as String
            }
            else if(rStr1.equals("")&&rStr2.equals("")){//if both hex values are ints
                rHexTotal=(""+rHex1+""+rHex2);//red hex value as String
            }
            totalHex=rHexTotal;//adds red hex values to total hexadecimal
            //
            //GREEN
            //
            System.out.print("G: ");//prompts user for green value
            //tests for input that is not an integer, prints error if input is not integer
            if (!myScanner.hasNextInt()){
                System.out.println("Incorrect input, input must be an integer");
                return;
            }
            int gVal = myScanner.nextInt(); //gVal is equal to integer entered as the G value
            //tests if gVal is between 0 and 255, prints error if gVal is not between 0 and 255
            if (gVal<0||gVal>255){
                System.out.println("Incorrect input, please make sure that "+
                "the integer values are between 0 and 255 inclusive");
                return;
            }
            int gHex1=(gVal/16); //finds first part of integer as hexadecimal
            int gHex2=gVal%16; //finds second part of integer as hexadecimal
            //declares Strings gStr1 and gStr2 in case the value of
            //one of the integers is a letter in hexadecimal (10-15 inclusive have letter representations)
            String gStr1="";
            String gStr2="";
            //declares String gHexTotal to hold the hexadecimal of the Green RGB value
            String gHexTotal="";
            switch(gHex1){
                case 10: gStr1="A"; //if gHex1 is equal to 10, it is equal to A in hexadecimal
                break;
                case 11: gStr1="B";//if gHex1 is equal to 11, it is equal to B in hexadecimal
                break;
                case 12: gStr1="C";//if gHex1 is equal to 12, it is equal to C in hexadecimal
                break;
                case 13: gStr1="D";//if gHex1 is equal to 13, it is equal to D in hexadecimal
                break;
                case 14: gStr1="E";//if gHex1 is equal to 14, it is equal to E in hexadecimal
                break;
                case 15: gStr1="F";//if gHex1 is equal to 10, it is equal to F in hexadecimal
                break;
            }
            switch(gHex2){  //same process as with switch(gHex1) but with gHex2
                case 10: gStr2="A"; 
                break;
                case 11: gStr2="B"; 
                break;
                case 12: gStr2="C";
                break;
                case 13: gStr2="D";
                break;
                case 14: gStr2="E";
                break;
                case 15: gStr2="F";
                break;
            }
            if(gStr1.equals("")==false&&gStr2.equals("")==false){//if both hex values are letters
                gHexTotal=(gStr1+gStr2); //green hex value as String
            }
            else if(gStr1.equals("")==false&&gStr2.equals("")){//if the first hex value is a letter and the second is an int
                gHexTotal=(gStr1+""+gHex2);//green hex value as String
            }
            else if(gStr1.equals("")&&gStr2.equals("")==false){//if the first hex value is an int and the second is a letter
                gHexTotal=(""+gHex1+gStr2);//green hex value as String
            }
            else if(gStr1.equals("")&&gStr2.equals("")){//if both hex values are ints
                gHexTotal=(""+gHex1+""+gHex2);//green hex value as String
            }   
            totalHex+=gHexTotal;//adds green hex values to total hexidecimal
           //
           //Blue
           //
            System.out.print("B: ");//prompts user for blue value
            //tests for input that is not an integer, prints error if input is not integer
            if (!myScanner.hasNextInt()){
                System.out.println("Incorrect input, input must be an integer");
                return;
            }
            int bVal = myScanner.nextInt(); //bVal is equal to integer entered as the B value
            //tests if bVal is between 0 and 255, prints error if bVal is not between 0 and 255
            if (bVal<0||bVal>255){
                System.out.println("Incorrect input, please make sure that "+
                "the integer values are between 0 and 255 inclusive");
                return;
            }
            int bHex1=(bVal/16); //finds first part of integer as hexadecimal
            int bHex2=bVal%16; //finds second part of integer as hexadecimal
            //declares Strings bStr1 and bStr2 in case the value of
            //one of the integers is a letter in hexadecimal (10-15 inclusive have letter representations)
            String bStr1="";
            String bStr2="";
            //declares String bHexTotal to hold the hexadecimal of the Blue RGB value
            String bHexTotal="";
            switch(bHex1){
                case 10: bStr1="A"; //if bHex1 is equal to 10, it is equal to A in hexadecimal
                break;
                case 11: bStr1="B";//if bHex1 is equal to 11, it is equal to B in hexadecimal
                break;
                case 12: bStr1="C";//if bHex1 is equal to 12, it is equal to C in hexadecimal
                break;
                case 13: bStr1="D";//if bHex1 is equal to 13, it is equal to D in hexadecimal
                break;
                case 14: bStr1="E";//if bHex1 is equal to 14, it is equal to E in hexadecimal
                break;
                case 15: bStr1="F";//if bHex1 is equal to 10, it is equal to F in hexadecimal
                break;
            }
            switch(bHex2){  //same process as with switch(bHex1) but with bHex2
                case 10: bStr2="A"; 
                break;
                case 11: bStr2="B"; 
                break;
                case 12: bStr2="C";
                break;
                case 13: bStr2="D";
                break;
                case 14: bStr2="E";
                break;
                case 15: bStr2="F";
                break;
            }
            if(bStr1.equals("")==false&&bStr2.equals("")==false){//if both hex values are letters
                bHexTotal=(bStr1+bStr2); //blue hex value as String
            }
            else if(bStr1.equals("")==false&&bStr2.equals("")){//if the first hex value is a letter and the second is an int
                bHexTotal=(bStr1+""+bHex2);//blue hex value as String
            }
            else if(bStr1.equals("")&&bStr2.equals("")==false){//if the first hex value is an int and the second is a letter
                bHexTotal=(""+bHex1+bStr2);//blue hex value as String
            }
            else if(bStr1.equals("")&&bStr2.equals("")){//if both hex values are ints
                bHexTotal=(""+bHex1+""+bHex2);//blue hex value as String
            }
            totalHex+=bHexTotal;//adds blue hex values to total hexadecimal 
           System.out.println("The decimal numbers for RGB in hexadecimal are represented as: "+
           totalHex);
            
        }//end of main method
    }//end of class