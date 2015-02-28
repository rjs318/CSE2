//Rachel Shields
//CSE2 Professor Chen
//2-26-15
//
//The smile generator program prints out smiley faces :) using different
//forms of loops 
public class SmileGenerator{
    public static void main(String[] args){
        System.out.println("Step 1:");
        int countA = 0; //sets the count for the first loop equal to zero
        String output1="";//creates a String to store the five smiley faces
        while(countA<5){//while the count is less than 5, a smiley face will 
        //be added to the output1 String
            output1+=":) ";//adds one smiley face to the String output1
            countA++;//increases the countA by 1
        }
        System.out.println(output1);//prints the five smiley faces added to 
        //output1 from the while loop
        String output2="";//creates a String to store the five smiley faces
        for(int i=0; i<5; i++){//adds a smiley face to the output2 String until
        //there are five smiley faces in the String
            output2+=":) ";
        }
        System.out.println(output2);//prints the five smiley faces added to 
        //output2 from the for loop
        int countB=0;//sets the count for the do while loop to zero
        String output3 = "";///creates a String to store the five smiley faces
        do{
            output3+=":) ";//adds a smiley face to output3
            countB++;//increases countB by 1
        }while(countB<5);//the above process is executed while the count is <5
        System.out.println(output3);//prints the five smiley faces added to 
        //output3
        System.out.println("Step 2 and 3:");
        int numSmiley =(int) (Math.random()*101)+1;//generates a number from 1 to
        //100 which will indicate the number of smileys generated in the next loop
        int numSmiley4 = numSmiley; //saves the random number for the loop for step 4
        int smileyCount = 0; //sets count for smileys equal to zero
        String ranOutput = ""; //creates a string to store the random number of smileys
        String thirtySmiley = ""; //creates a string to hold thirty smileys
        System.out.println("the random number of smileys generated is: "+numSmiley);//prints num Smiley
        //prints out the number of smileys as designated by the random number generated 
        while(smileyCount<numSmiley){
            ranOutput+=":) ";
            smileyCount++;
            //limits the number of smileys printed to thirty for one line
            while(smileyCount==30){
                thirtySmiley=ranOutput;
                numSmiley=numSmiley-smileyCount;
                smileyCount=0;
                System.out.println(ranOutput);
                ranOutput="";
            }
            }
        System.out.println(ranOutput);//prints out the smileys that don't take up a line
        //of thirty     
        System.out.println("Step 4:");   
        String output4="";//string to hold smileys for last step
        //prints number of smileys for the number of lines
        for(int i=0;i<numSmiley4;i++){
            output4+=":) ";//adds one smiley face to the String 
            System.out.println(output4);
        }
    }//end of main method 
}//end of class 
