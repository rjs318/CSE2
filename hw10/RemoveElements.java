//Rachel Shields
//CSE2 Professor Chen
//The RemoveElements program creates an array of ten random integers from 0 to 9
//and gives the user options such as removing a certain position from the array
//or removing certain elements from the array. The program prints the new
//arrays that result from the user input.
import java.util.*;
    public class RemoveElements{
        public static int[] randomInput(){//creates an array and fills
        // it with 10 random numbers from 0 to 9
            int tempArray[]=new int[10];
               for(int i=0;i<10;i++){
                   Random randomGen = new Random();
                   int ranNum = randomGen.nextInt(10);
                   tempArray[i]=ranNum;
               } 
            return tempArray;//returns the generated array
        }
        public static int[] delete(int[] list, int pos){//removes the element in an array at pos
            int size = list.length-1;
            int tempArray[]=new int[size];//creates new array with one less spot than list
            if(pos>size||pos<0){//prints error if position is out of bounds
                System.out.println("Error. Index out of bounds.");
                tempArray=list;
            }
            else{
                for(int i=0;i<size;i++){
                    if(i>=pos){
                        //if i is equal to pos, the element at index i
                        //of tempArray is given the value of the element
                        //at index i+1 in list
                        tempArray[i]=list[i+1];
                    }
                    else{
                        tempArray[i]=list[i];
                    }
                }
            }
            return tempArray;
        }
        public static int[] remove(int[] list, int target){
            int[] newList= new int[10];
            newList=list;
            int i =0;
            //removes the target value from the indexes it is located at
            //in the array
            while(newList.length>i){
                if(newList[i]==target){
                    //accounts for double and triple adjacent indexes containing the target
                    if(i!=(newList.length-1)&&newList[i]==target&&newList[i+1]==target){
                        if(i!=(newList.length-2)&&newList[i]==target&&newList[i+1]==target&&newList[i+2]==target){
                            newList=delete(newList,i);
                        }
                      newList=delete(newList,i);  
                    }
                    newList=delete(newList,i);
                }
                i++;
            }
            if(newList.length<list.length){
                System.out.println("Element "+target+ " was found");
            }
            else{
                System.out.println("Element "+target+ " not found");
            }
            return newList;
        }
            
        public static void main(String [] arg){
        	Scanner scan=new Scanner(System.in);
            int num[]=new int[10];
            int newArray1[];
            int newArray2[];
            int index,target;
        	String answer="";
        	do{
          	System.out.print("Random input 10 ints [0-9]");
          	num = randomInput();
          	String out = "The original array is:";
          	out += listArray(num);
          	System.out.println(out);
         
          	System.out.print("Enter the index ");
          	index = scan.nextInt();
          	newArray1 = delete(num,index);
          	if(newArray1.length<num.length){
          	    System.out.println("Element at index "+index+" removed");
          	}
          	String out1="The output array is ";
          	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out1);
         
            System.out.print("Enter the target value ");
          	target = scan.nextInt();
          	newArray2 = remove(num,target);
          	String out2="The output array is ";
          	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out2);
          	 
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
          	answer=scan.next();
        	}while(answer.equals("Y") || answer.equals("y"));
            }
         
          public static String listArray(int num[]){
        	String out="{";
        	for(int j=0;j<num.length;j++){
          	if(j>0){
            	out+=", ";
          	}
          	out+=num[j];
        	}
        	out+="} ";
        	return out;
         }
    }