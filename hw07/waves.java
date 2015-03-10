//Rachel Shields
//3-9-15
//CSE2 Professor Chen
//The waves program prompts the user for an integer between 1 and 30, inclusive,
//then displays a wave like output that depends on the inputed value
import java.util.Scanner;
    public class waves{
        public static void main(String[]args){
            Scanner myScanner = new Scanner(System.in);
            int input=0;
            //checks for bad input
            while(input<1||input>30){//loop A
                    System.out.print("Enter a number between 1 and 30 (inclusive): " );
                    while(!myScanner.hasNextInt()){//loop B
                        System.out.println("Error. Enter a number between 1 and 30 (inclusive): ");
                        myScanner.next();
                    }//end of loop B
                input=myScanner.nextInt();
                if(input<1||input>30){
                    System.out.print("Error. ");
                }
            }//end of loop A 
            //
            //prints output using for loop
            System.out.println("FOR LOOP: ");
            int num;//control variable
            String temp = "";//stores output
            for(num=1;num<=input;num++){//gets output for every number from 1 to input
            //num starts at one and increases each time the loop is executed
            //num produces a different output depending on whether it is even or odd
                if(num%2==0){//if num is even during the loop
                    for(int j=0; j<num;j++){//and j is less than num
                    
                        for(int i=-1;i<j;i++){//and i is less than j, add string
                        //versions of num to temp string until i and j are equal
                            temp+=num;
                        }
                        temp+="\n";//after above loop is exited, start a new line
                        //in temp string
                    }
                }
                else if(num%2!=0){//if num is odd during the loop
                    for(int j=0; j<num;j++){//and j is less than num
                    
                        for(int i=num;i>j;i--){//and num equals i and is greater than j
                            temp+=num;//add string versions of num until i and j are equal
                        }
                        temp+="\n";//after above loop is exited, start a new line
                        //in temp string
                    }
                }
            }
            System.out.println(temp);//prints final temp string value
            //end of for loop 
            //
            //prints output using while loop
            //process is essentially the same but using a while loop instead of a for loop
            //and using a and b in place of j and i, respectively
            System.out.println("WHILE LOOP: ");
            num=1;
            temp="";
            int a=0;
            int b=0;
            while(num<=input){//executes loop until num is greater than the input
                if(num%2==0){//if num is even
                    a=0;//assign 0 to a
                    while(a<num){//while a is less than num
                        b=-1;//assign -1 to b
                        while(b<a){//while b is less than a
                            temp+=num;//add the string equivalent of num to the temp string
                            b++;//add one to b
                        }
                        temp+="\n";//after above loop is exited, start a new line
                        //in temp string
                        a++;//add one to a
                    }
                }
                else if(num%2!=0){//if num is odd
                    a=0;//assign 0 to a
                    while(a<num){ //while a is less than num
                        b=num;//assign the value of num to b
                        while(b>a){//while b is greater than a
                            temp+=num;//add the string equivalent of num to the temp string
                            b--;//subtract one from b
                        }
                        temp+="\n";//after above loop is exited, start a new line
                        //in temp string
                        a++;//add one to a
                    }
                }
                num++;//add one to num
            }
            System.out.println(temp);//prints final temp string value
            //end of while loop 
            //
            //prints output using do while loop 
            //same process as while loop except executed at least once before conditions are tested
            System.out.println("DO WHILE LOOP: ");
            temp="";
            num=1;
            do{
                if(num%2==0){
                    a=0;
                    do{
                        b=-1;
                        do{
                            temp+=num;
                            b++;
                        }
                        while(b<a);
                        temp+="\n";//after above loop is exited, start a new line
                        //in temp string
                        a++;
                    }
                    while(a<num);
                }
                else if(num%2!=0){
                    a=0;
                    do{
                        b=num;
                        do{
                            temp+=num;
                            b--;
                        }
                        while(b>a);
                        temp+="\n";//after above loop is exited, start a new line
                        //in temp string
                        a++;
                    }
                    while(a<num);
                }
                num++;
                
            }
            while(num<input+1);//because the do while loop executes at least once before testing,
            //num must be less than the input plus 1 in order to get the desired number of executions
            System.out.println(temp);//prints final temp string value
        }//end of main method
    }//end of class