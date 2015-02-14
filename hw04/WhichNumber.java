// Rachel Shields
// CSE2 Professor Chen
// 2-13-15
//
//The WhichNumber program asks the user to think of a number between 1 and 10,
//inclusive, then guesses the number based on a series of yes or no 
//questions answered by the user
import java.util.Scanner;
    public class WhichNumber{
        public static void main(String[] args){
            Scanner myScanner = new Scanner(System.in);
            //tells the user to think of a number between 1 and 10 inclusive
            System.out.println("Think of a number from 1 to 10 inclusive");
            //the program will ask a series of questions, the statement below
            //tells the user how they should reply to those questions
            System.out.println("Enter Y for yes and N for no");
            System.out.print("Is the number even?  "); //asks if the number is even
            String answer = myScanner.nextLine();//reads user's response
            if (answer.equals("Y")||answer.equals("y")){
                //if the number is even, the user is asked if it is divisible by 3
                System.out.print("Is the number divisible by 3?  ");
                answer = myScanner.nextLine();
                if (answer.equals("Y")||answer.equals("y")){
                    //if the number is even and divisible by 3
                    //the number is 6. The program asks if the number is 6
                    System.out.print("Is your number six?  ");
                    answer = myScanner.nextLine();
                    if (answer.equals("Y")||answer.equals("y")){
                        System.out.println("YAY!!");
                    }    
                    else if (answer.equals("N")||answer.equals("n")){
                        System.out.println("Don't lie. Your number is six!");
                    }
                    else{
                        System.out.println("Sorry. That is not a valid response"); //catches bad input
                    }
                }
                else if (answer.equals("N")||answer.equals("n")){
                    //if the number is even but not divisible by 3, the user is 
                    //asked if the number is divisible by 4
                    System.out.print("Is the number divisible by 4?  ");
                    answer = myScanner.nextLine();
                    if (answer.equals("Y")||answer.equals("y")){
                        //if the number is even, not divisible by 3, but divisible by 4
                        //the user is asked if the number divided by 4 is greater than 1
                        System.out.print("Is the number divided by 4 greater than 1?  ");
                        answer = myScanner.nextLine();
                        if (answer.equals("Y")||answer.equals("y")){
                            //if the number is even, not divisible by 3, but divisible by 4
                            //and  divided by 4 is greater than 1, then the number is 8.
                            //the user is asked if the number is 8
                            System.out.print("Is your number eight?  ");
                            answer = myScanner.nextLine();
                                if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                                }    
                                else if (answer.equals("N")||answer.equals("n")){
                                System.out.println("Don't lie. Your number is eight!");
                                }
                                else{
                                    System.out.println("Sorry. That is not a valid response");//catches bad input
                                }
                        }
                        else if (answer.equals("N")||answer.equals("n")){
                        //if the number is even, not divisible by 3, but divisible by 4
                        //and  divided by 4 is NOT greater than 1, then the number is 4.
                        //the user is asked if the number is 4
                        System.out.print("Is your number four?  ");
                        answer = myScanner.nextLine();
                            if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                            }    
                            else if (answer.equals("N")||answer.equals("n")){
                                System.out.println("Don't lie. Your number is four!");
                            }
                            else{
                                System.out.println("Sorry. That is not a valid response");
                            }
                        }
                        else{
                            System.out.println("Sorry. That is not a valid response");//catches bad input
                        }
                    }    
                    else if(answer.equals("N")||answer.equals("n")){
                        //if the number is even, not divisible by 3, and not divisible by 4,
                        //the user is asked if the number is divisible by 5
                        System.out.print("Is the number divisible by 5?  ");
                        answer = myScanner.nextLine();
                            if(answer.equals("Y")||answer.equals("y")){
                            //if the number is even, not divisible by 3, not divisible by 4,
                            //but divisible by 5, the number is 10. The user is asked if the 
                            //number is 10
                                System.out.print("Is your number ten?  ");
                                answer = myScanner.nextLine();
                                if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                                }    
                                else if (answer.equals("N")||answer.equals("n")){
                                System.out.println("Don't lie. Your number is ten!");
                                }
                                else{
                                    System.out.println("Sorry. That is not a valid response");//catches bad input
                                }
                            }
                            else if(answer.equals("N")||answer.equals("n")){
                            //if the number is even, not divisible by 3, not divisible by 4,
                            //and not divisible by 5, the number is 2. The user is asked if the 
                            //number is 2   
                                System.out.print("Is your number two?  ");
                                answer = myScanner.nextLine();
                                if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                                }    
                                else if (answer.equals("N")||answer.equals("n")){
                                System.out.println("Don't lie. Your number is two!");
                                }
                                else{
                                    System.out.println("Sorry. That is not a valid response");//catches bad input
                                }
                            }
                            else{
                                System.out.println("Sorry. That is not a valid response");//catches bad input
                            }
                     }
                     else{
                         System.out.println("Sorry. That is not a valid response");//catches bad input
                     }
                 }
                 else{
                     System.out.println("Sorry. That is not a valid response.");//catches bad input
                 }
            }
            else if(answer.equals("N")||answer.equals("n")){
                //if the number is not even, the user is asked if the number is divisible by 3
                System.out.print("Is the number divisible by 3?  ");
                answer = myScanner.nextLine();
                if (answer.equals("Y")||answer.equals("y")){
                //if the number is odd, and divisible by 3, the user is asked if the number
                //when divided by 3 is greater than 1
                    System.out.print("When divided by 3 is the result greater than 1?  ");
                    answer = myScanner.nextLine();
                    if (answer.equals("Y")||answer.equals("y")){
                    //if the number is odd, divisible by three, and when divided by three is greater
                    //than one, then the number is nine. The user is asked if the number is nine.
                        System.out.print("Is your number nine?  ");
                        answer = myScanner.nextLine();
                        if (answer.equals("Y")||answer.equals("y")){
                            System.out.println("YAY!!");
                            }    
                            else if (answer.equals("N")||answer.equals("n")){
                            System.out.println("Don't lie. Your number is nine!");
                            }
                            else{
                                System.out.println("Sorry. That is not a valid response");//catches bad input
                            }
                    }
                    else if(answer.equals("N")||answer.equals("n")){
                    //if the number is odd, divisible by three, and when divided by three is NOT greater
                    //than one, then the number is three. The user is asked if the number is three
                        System.out.print("Is your number three?  ");
                        answer=myScanner.nextLine();
                        if (answer.equals("Y")||answer.equals("y")){
                            System.out.println("YAY!!");
                            }    
                            else if (answer.equals("N")||answer.equals("n")){
                            System.out.println("Don't lie. Your number is three!");
                            }
                            else{
                                System.out.println("Sorry. That is not a valid response");//catches bad input
                            }
                    }
                    else{
                        System.out.println("Sorry. That is not a valid response");//catches bad input
                    }
                }
                else if(answer.equals("N")||answer.equals("n")){
                //if the number is odd and not divisible by 3, then the user is asked if
                //the number is greater than 6
                    System.out.print("Is the number greater than 6?  ");
                    answer = myScanner.nextLine();
                    if (answer.equals("Y")||answer.equals("y")){
                    //if the number is odd, not divisible by 3, and greater than 6 
                    //than the number is 7. The user is asked if the number is 7.
                        System.out.print("Is your number seven?  ");
                        answer = myScanner.nextLine();
                        if (answer.equals("Y")||answer.equals("y")){
                            System.out.println("YAY!!");
                        }    
                        else if (answer.equals("N")||answer.equals("n")){
                            System.out.println("Don't lie. Your number is seven!");
                        }
                        else{
                            System.out.println("Sorry. That is not a valid response");//catches bad input
                        }
                    }    
                    else if(answer.equals("N")||answer.equals("n")){
                    //if the number is odd, not divisible by 3, and less than 6
                    //than the user is asked if the number is less than three
                        System.out.print("Is the number less than 3?  ");
                        answer = myScanner.nextLine();
                        if (answer.equals("Y")||answer.equals("y")){
                        //if the number is odd, not divisible by 3, less than 6
                        //and less than 3 then the number is 1. The user is
                        //asked if the number is 1.
                            System.out.print("Is your number one?  ");
                            answer = myScanner.nextLine();
                            if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                            }    
                            else if (answer.equals("N")||answer.equals("n")){
                            System.out.println("Don't lie. Your number is one");
                            }
                            else{
                                System.out.println("Sorry. That is not a valid response");//catches bad input
                            }
                        }    
                        else if(answer.equals("N")||answer.equals("n")){
                        //if the number is odd, not divisible by 3, less than 6
                        //and greater than 3 then the number is 5. The user is
                        //asked if the number is 5.    
                            System.out.print("Is your number five?  ");
                            answer = myScanner.nextLine();
                            if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                            }    
                            else if (answer.equals("N")||answer.equals("n")){
                            System.out.println("Don't lie. Your number is five");
                            }
                            else{
                                System.out.println("Sorry. That is not a valid response");//catches bad input
                            }
                        }
                        else{
                            System.out.println("Sorry. That is not a valid response");//catches bad input
                        }
                    
                    }
                    else{
                        System.out.println("Sorry. That is not a valid response");//catches bad input
                    }
                }
                else{
                    System.out.println("Sorry. That is not a valid response");//catches bad input
                }
            }
            else{
                System.out.println("Sorry. That is not a valid response");//catches bad input
            }
        }//end of main method
    }//end of class