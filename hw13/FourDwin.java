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
    /*sort4DArray uses insertion sort to compare the sizes of all the 3D arrays in the 4D
    array and then rearrange them so that the sizes are in ascending order. After the 3D arrays are sorted by size,
    their values are sorted by calling the 3D sort method. At the end of the sort4D method, the method countlength is called.
    */
    public static void sort4DArray(double[][][][] A) {
        //insertion sort that sorts 4D array from smallest to largest 3D arrays
        double temp[][][];
        int j=0;
        for(int i=1;i<A.length;i++){
            temp = A[i];
            j=(i-1);
            while(j>=0&&(temp.length<A[j].length)){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=temp;
        }
        //sorts all the 3D arrays
        for(int m=0; m<A.length;m++){
                sort3Darray(A[m]);
          }
        countLength(A);
    }
    //the countLength method checks if an of the 3D arrays have the same length, 
    //if they do, the method rearranges them in order of lowest value in 3D array
    public static void countLength(double[][][][]A){
        double temp[][][];
        int zero=0;
        int one=1;
        int two=2;
        double lowest1=A[0][0][0][0];
        double lowest2=A[1][0][0][0];
        double lowest3=A[2][0][0][0];
        //finds lowest value in first 3D array
        for(int i=0; i<1; i++){
            for(int j=0; j<A[i].length; j++){
                for(int k=0; k<A[i][j].length; k++){
                    for(int l=0; l<A[i][j][k].length;l++){
                        if(A[i][j][k][l]<lowest1){
                            lowest1=A[i][j][k][l];
                        }
                    }
                }
            }
        }
        //finds lowest value in second 3D array
        for(int i=1; i<2; i++){
            for(int j=0; j<A[i].length; j++){
                for(int k=0; k<A[i][j].length; k++){
                    for(int l=0; l<A[i][j][k].length;l++){
                        if(A[i][j][k][l]<lowest1){
                            lowest2=A[i][j][k][l];
                        }
                    }
                }
            }
        }
        //finds lowest value in third 3D array
       for(int i=2; i<3; i++){
            for(int j=0; j<A[i].length; j++){
                for(int k=0; k<A[i][j].length; k++){
                    for(int l=0; l<A[i][j][k].length;l++){
                        if(A[i][j][k][l]<lowest1){
                            lowest3=A[i][j][k][l];
                        }
                    }
                }
            }
        }
    //compares the lengths of the values and swaps them according to their lowest values if the lengths are equal    
    if(A[zero].length==A[one].length){
        if(lowest2<lowest1){
            temp=A[zero];
            A[zero]=A[one];
            A[one]=temp;
        }
    }
    if(A[zero].length==A[two].length){
        if(lowest3<lowest1){
            temp=A[zero];
            A[zero]=A[two];
            A[two]=temp;
        }
    }
    if(A[one].length==A[two].length){
        if(lowest3<lowest2){
            temp=A[one];
            A[one]=A[two];
            A[two]=temp;
        }
    }
}
    public static void sort3Darray(double[][][] A){
        //sorts the values in a 3D array by filling a 1D array with those values and calling selection sort on the 
        //1D array. 
        for(int i=0; i<A.length; i++){
            for(int j=0;j<A[i].length;j++){
                double[] B = new double[A[i][j].length];
                for(int k=0; k<A[i][j].length;k++){
                    B[k]=A[i][j][k];
                }
                SelectionSort(B);
                for(int l=0; l<A[i][j].length;l++){//puts sorted values of 1D array into the original 3D array
                    A[i][j][l]=B[l];
                }
            }    
        }
    }//end of sort3Darray
    public static void SelectionSort(double[] A){
        //sorts values in ascending order
        int first=0;
        double temp=0;  
        for (int i=A.length-1;i>0;i--){
            first=0;
            for(int j=1;j<=i;j++){
                if(A[j]>A[first])         
                    first = j;
          }
          temp=A[first];
          A[first]=A[i];
          A[i]=temp; 
        }
    }
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
        System.out.println("Sorted Array: ");
        sort4DArray(four);
        System.out.println(printArray(four));
        System.out.println(statArray(four));
        
    }//end of main method
}//end of class
