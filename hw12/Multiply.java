//Rachel Shields
//CSE2 Professor Chen
// The Multiply program creates two 2D arrays with sizes specified
//by the user, fills the arrays with random integers between -10 and 10,
//and then multiplies the two arrays and prints the product
//
import java.util.*;
public class Multiply{
    //creates random 2D array
    public static int[][] randomMatrix(int height, int width){
        int[][] randomArray = new int[height][width];
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                //fills array with random integers -10 to 10
               Random randomGen = new Random();
               int ranNum =10-randomGen.nextInt(21);
               randomArray[i][j]=ranNum;
               } 
            }
            return randomArray;
        }//end of randomMatrix method
    //prints a 2D array    
    public static void printMatrix( int[][] array){
        String output="";
        if(array==null){
            output=("The array was empty!");
        }
        else{
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    output+=("["+array[i][j]+"]");
                }
                output+=("\n");
            } 
        }
        System.out.println(output);
    }//end of printMatrix method
    
    //calculates the scalar product of two matrices
    public static int[][] matrixMultipy(int[][] mat1, int[][] mat2){
        if(mat1[0].length!=mat2.length){//when the number of columns of the 
        //mat1 is not equal to the number of rows in mat2, multiplication doesn't work
            System.out.println("Error. The matrices do not have"+
            "the same dimensions and therefore cannot be multiplied");
            return null;
        }
        int[][] product= new int[mat1.length][mat2[0].length];//the size of the product of multiplying two matrices
        //will have the same number of rows as the first matrix (mat1) and the same number of
        //columns as the second matrx (mat2)
        int val = 0; 
        for(int i=0;i<mat1.length;i++){//i = row of mat1
            for(int j=0; j<mat2[0].length;j++){//j = column of mat2
                for(int k=0;k<mat2.length;k++){//k = column of mat1 and row of mat2 
                    val+=mat1[i][k]*mat2[k][j];
                }
            product[i][j]=val;
            val=0;
            }
        }
        return product;
    }//end of Matrix multiply method
    
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
    
    //main method
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //when the number of columns of the first matrix is not equal to the number of rows
        //in the second matrix, multiplication doesn't work
        int c1=0;//columns in first matrix
        int h2=-1;//rows in second matrix
        int h1=0;//rows in first matrix
        int c2=0;//columns in second matrix
        while(c1!=h2){//will continue to prompt until proper dimensions are entered
            System.out.print("Enter the number of rows for the first matrix: ");
            h1 = checkInput(scan);//checks for valid input
            System.out.print("Enter the number of columns for the first matrix: ");
            c1 = checkInput(scan);//checks for valid input
            System.out.print("Enter the number of rows for the second matrix: ");
            h2 = checkInput(scan);//checks for valid input
            System.out.print("Enter the number of columns for the second matrix: ");
            c2 = checkInput(scan);//checks for valid input
            if(c1!=h2){
                System.out.println("Error. The number of columns of the first array must"+
                " equal the number of rows in the second array. Please re-enter dimensions. ");
            }
        }
        System.out.println("Matrix 1 is: ");
        int[][] array1= randomMatrix(h1,c1);//creates first matrix
        int[][] array2= randomMatrix(h2,c2);//creates second matrix
        printMatrix(array1);//prints first matrix
        System.out.println("Matrix 2 is: ");
        printMatrix(array2);//prints second matrix
        System.out.println("The scalar product of these two matrices is: ");
        int[][] finalMat=matrixMultipy(array1,array2);//multiplies the two matrices
        printMatrix(finalMat);//prints the product of the two matrices
    }//end of main method
}//end of class