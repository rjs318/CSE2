//Rachel Shields
//CSE2 Professor Chen
//the FourDwin program creates a ragged 4D array, sorts it, and displays the array's
//number of members, sum, and mean
import java.util.*;
public class FourDwin{
    //checks for bad user input
    public static int checkInput(Scanner myScanner){
        int input=-1;
        while(input<0){
                while(!myScanner.hasNextInt()){//checks if input is an integer
                    System.out.println("Error: input not an integer. Enter a positive integer: ");
                    myScanner.next();
                }
            input=myScanner.nextInt();
            if(input<0){//checks if input is positive
                System.out.print("Error: input was negative. Enter a positive integer: ");
            }
        }
        return input;
    }//end of checkInput method
    //returns a Sting holding a 4D array and its corresponding brackets
    public static String printArray(double[][][][] A){
        String output =("{"+"\n");
        for(int i=0; i<A.length; i++){
            output+=("{"+"\n");
            for(int j=0; j<A[i].length; j++){
                for(int k=0; k<A[i][j].length; k++){
                    output+=("{{");
                    for(int l=0; l<A[i][j][k].length;l++){
                        output+=(+A[i][j][k][l]+", ");
                    }
                    output+=("}},");
                }
                output+="\n";
            }
            output+=("},"+"\n");
        }
        output+=("}");
        return output;
    }//end of printArray method
    //finds the sum, number of elements in the 4D array, and the mean of the array and returns them as a String
    public static String statArray(double[][][][] A){
        double sum=0;
        int elements=0;
        double mean=0;
        String output="";
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                for(int k=0; k<A[i][j].length; k++){
                    for(int l=0; l<A[i][j][k].length;l++){
                        sum+=A[i][j][k][l];//adds element at index to the sum
                        elements++;
                    }
                }
            }
        }
        mean=sum/elements;
        output=("Members: "+elements+"\n"+"Sum: "+sum+"\n"+"Mean: "+mean);
        return output;
    }//end of statArray method
    /* sort4DArray method needs to use insertion sort to compare the sizes of all the 3D arrays in the 4D
    array and then rearrange them so that the sizes are in ascending order. if the sizes of any of the 3D
    arrays are the same, they are sorted according to the values of the 3D array through a selection sort.
    I was unable to write the methods however I included an attempt in comments
    
    public static void sort4DArray(double[][][][] A) {
        int minlength=0; //length of smallest 3D array
        int k=0;
        for(int i=0; i<A.length;i++){
            for (int j=1; j<A[i].length; j++) { //j is equal to one because the first posiition itself is sorted
                minlength = A[j].length; 
                k = j;
                while (k >0 &&A[k - 1].length > minlength) {//should shift 3D array back in its order until 
                //it is sorted
                      A[i]= A[k - 1][][];// somehow need to move the order within the 4D array but I don't know how
                      k--;
                }
                minlength=A[i].length;
          }
        }
        //need something to check if any of the 3D arrays are the same size, if they are - call 
        sort3Darray within the method
    }
    public static void sort3Darray(double[] A){
        //uses selection sort to sort the values within the 3D array as a 1D array and then
        //somehow should transfer them back into the 4Darray 
        //then somehow puts them into the 4D array as sorted
        int first=0;
        int temp=0;  
        for (int i= A.length-1;i>0;i--)  {
            first = 0;
            for(int j=1;j<= i;j++){
                if( A[j]>A[first] )         
                    first = j;
          }
          temp= A[first];
          A[first] = A[i];
          A[i]= temp; 
      }           
    }
    */
    
    public static void main(String[] args){
        //prompts user for two integers X and Y where Y>X
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer X: ");
        int x = checkInput(scan);
        System.out.print("Enter an integer Y where Y > X: ");
        int y = checkInput(scan);
        //checks to make sure that Y is greater than X, if y<=x the user will continue to be 
        //prompted until an integer greater than X is entered
        while(y<=x){
            System.out.println("Error: Y must be greater than X. Enter an integer greater than "+x+": ");
            y=checkInput(scan);
        }
        Random rangen = new Random();
        int dim3 = 0;//length of 3D array
        int dim2 = 0;//length of 2D array
        int dim1 = 0;//length of 1D array
        //creates a 4D array with outermost size of three
        double[][][][] four = new double[3][][][];
        //other dimensions are assigned a length of a random value between X and Y
        //often results in a ragged array being created
        for(int i=0; i<3; i++){
            dim3=rangen.nextInt((y-x)+ 1) + x;//dim3 is set to a random value between X and Y
            four[i]=new double[dim3][][];//the 4D array is filled with a 3D array of size dim3 at i
            for(int j=0; j<dim3; j++){
                dim2=rangen.nextInt((y-x)+ 1) + x;//dim2 is set to a random value between X and Y
                four[i][j]=new double[dim2][];//the 4D array is filled with a 2D array of size dim2 at [i][j]
                for(int k=0; k<dim2; k++){
                    dim1=rangen.nextInt((y-x)+ 1) + x;//dim1 is set to a random value between X and Y
                    four[i][j][k] =new double[dim1];//the 4D array is filled with a 1D array of size dim1 at [i][j][k]
                    for(int l=0; l<dim1;l++){
                        //fills the array with doubles from 0 to 30
                        double random =rangen.nextDouble()*31;
                        random*=10;
                        random=(int)random;
                        random= (random)/(10.0);
                        four[i][j][k][l]=random;
                    }
                }
            }
        }    
        System.out.println("Original Array: ");
        System.out.println(printArray(four));
        //System.out.println("Sorted Array: ");
        //sort4DArray(four);
        //System.out.println(printArray(four));
        System.out.println(statArray(four));
        
    }//end of main method
}//end of class
