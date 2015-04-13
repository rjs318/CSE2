//Rachel Shields
//CSE2 Professor Chen
//The CSE2Linear program creates an array of 15 ints for students’ final grades in CSE2,
//promts for a grade to search for, performs a binary search for a target value, scrambles
//the array, performs a linear search for another target value, and prints the number of 
//iterations for each type of search. 
//
import java.util.*;
public class CSE2Linear{
    public static String getArray(int list[]){//creates string of the array elements
    //and separates them by a comma
        	String thearray="";
        	for(int i=0;i<list.length;i++){
              	if(i>0){
                	thearray+=", ";
              	}
              	thearray+=list[i];
        	}
        	return thearray;
         }
    public static String binarySearch(int[] list, int target){//searches array for a target value
        String status="";//whether target is found or not in the array
        //and the number of iterations
        int iterations=0;//counts the number of iterations
        int lowbound=0;
        int upbound=list.length-1;
        while(upbound>=lowbound){
            int mid = (upbound+lowbound)/2;//finds middle of array
            if(list[mid]==target){
                iterations++;
                status =(target+" was found in the array at index "+mid+
                " after "+iterations+" iterations." );
                return status;
            }
            if(list[mid]<target){
                lowbound=mid+1;//will search the upper part of the array
            }
            if(list[mid]>target){
                upbound=mid-1;//will search the lower part of the array
            }
        iterations++;    
        }
        status = (target+ " was not found in the array after "+ iterations+
        " iterations");
        return status;  
    }
    public static int[] scramble(int[] list){
        int[] temp = new int[list.length];
        for(int i=0; i<list.length; i++){
        //swaps the value of i with the value at a random index, ranNum
           Random randomGen = new Random();
           int ranNum = randomGen.nextInt(list.length);//generates random index
           int swap=list[ranNum];//variable "swap" holds the value of
           //the element at list[ranNum]
           list[ranNum]=list[i];//sets the value of list[ranNum}
           //to the value at list[i]
           list[i]=swap;//sets the value of list[i] to swap 
        }
    return list;    
    }
    public static String linearSearch(int[] list, int target){//linear search for min value in array
        String status="";//whether target is found or not in the array
        //and the number of iterations
        int iterations=0;//counts the number of iterations
        for(int i=0; i<list.length; i++){
            iterations++;
            if(list[i]==target){
               status =(target+" was found in the array at index "+i+
                " after "+iterations+" iterations." );
                return status;
            }
        }
        status = (target+ " was not found in the array after "+ iterations+
        " iterations");
        return status;  
    }
    //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int[] grades = new int[15];
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        for(int j=0; j<15;j++){
        int input=-1;
        //checks for bad input and fills the grades array with valid input
            while(input<0||input>100){
                    while(!myScanner.hasNextInt()){
                        System.out.println("Error. Input must be an integer: ");
                        myScanner.next();
                    }
                input=myScanner.nextInt();
                if(input<0||input>100){
                    System.out.println("Error. Input must be in the range of 0 to 100: ");
                }
                else{
                    grades[j]=input;
                    if(j>0&&grades[j]<grades[j-1]){
                        System.out.println("Error. The input must be greater than or equal to the previous input");
                        input=-1;
                    }
                }
            }
        }
        String output="The array is ";
        output+=getArray(grades);//prints out the final array
        System.out.println(output); 
        System.out.print("Enter a grade to search for: ");
        //checks for bad input
        int num = -1;
        while(num<0||num>100){
            while(!myScanner.hasNextInt()){
                System.out.println("Error. You must enter an integer: ");
                myScanner.next();
            }
        num=myScanner.nextInt();
            if(num<0||num>100){
                System.out.println("Error. You must enter a value in the range of 0 to 100: ");
            }
        }
        System.out.println(binarySearch(grades,num));//runs binary search for num in grades and prints result
        grades=(scramble(grades));//scrambles the array randomly
        String output2="The scrambled array is ";
        output2+=getArray(grades);
        System.out.println(output2);//prints out the final array
        System.out.print("Enter a grade to search for: ");
        //checks for bad input
        num = -1;
        while(num<0||num>100){
            while(!myScanner.hasNextInt()){
                System.out.println("Error. You must enter an integer: ");
                myScanner.next();
            }
        num=myScanner.nextInt();
            if(num<0||num>100){
                System.out.println("Error. You must enter a value in the range of 0 to 100: ");
            }
        }
        System.out.println(linearSearch(grades,num));//runs linear search for num in grades and prints result
        
    }//end of main method
}//end of class
            