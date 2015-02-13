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
            System.out.println("Think of a number from 1 to 10 inclusive");
            System.out.println("Enter Y for yes and N for no");
            System.out.print("Is the number even?  ");
            String answer = myScanner.nextLine();
            if (answer.equals("Y")||answer.equals("y")){
                System.out.print("Is the number divisible by 3?  ");
                answer = myScanner.nextLine();
                if (answer.equals("Y")||answer.equals("y")){
                    System.out.print("Is your number six?  ");
                    answer = myScanner.nextLine();
                    if (answer.equals("Y")||answer.equals("y")){
                        System.out.println("YAY!!");
                    }    
                    else if (answer.equals("N")||answer.equals("n")){
                        System.out.println("Don't lie. Your number is six!");
                    }
                }
                else if (answer.equals("N")||answer.equals("n")){
                    System.out.print("Is the number divisible by 4?  ");
                    answer = myScanner.nextLine();
                    if (answer.equals("Y")||answer.equals("y")){
                        System.out.print("Is the number divided by 4 greater than 1?  ");
                        answer = myScanner.nextLine();
                        if (answer.equals("Y")||answer.equals("y")){
                            System.out.print("Is your number eight?  ");
                            answer = myScanner.nextLine();
                                if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                                }    
                                else if (answer.equals("N")||answer.equals("n")){
                                System.out.println("Don't lie. Your number is eight!");
                                }
                        }
                        else if (answer.equals("N")||answer.equals("n")){
                        System.out.print("Is your number four?  ");
                        answer = myScanner.nextLine();
                            if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                            }    
                            else if (answer.equals("N")||answer.equals("n")){
                                System.out.println("Don't lie. Your number is four!");
                            }
                        }
                    }    
                    else if(answer.equals("N")||answer.equals("n")){
                        System.out.print("Is the number divisible by 5?  ");
                        answer = myScanner.nextLine();
                            if(answer.equals("Y")||answer.equals("y")){
                                System.out.print("Is your number ten?  ");
                                answer = myScanner.nextLine();
                                if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                                }    
                                else if (answer.equals("N")||answer.equals("n")){
                                System.out.println("Don't lie. Your number is ten!");
                                }
                            }
                            else if(answer.equals("N")||answer.equals("n")){
                                System.out.print("Is your number two?  ");
                                answer = myScanner.nextLine();
                                if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                                }    
                                else if (answer.equals("N")||answer.equals("n")){
                                System.out.println("Don't lie. Your number is two!");
                                }
                            }
                     }
                 }
            }
            else if(answer.equals("N")||answer.equals("n")){
                System.out.print("Is the number divisible by 3?  ");
                answer = myScanner.nextLine();
                if (answer.equals("Y")||answer.equals("y")){
                    System.out.print("When divided by 3 is the result greater than 1?  ");
                    answer = myScanner.nextLine();
                    if (answer.equals("Y")||answer.equals("y")){
                        System.out.print("Is your number nine?");
                        if (answer.equals("Y")||answer.equals("y")){
                            System.out.println("YAY!!");
                            }    
                            else if (answer.equals("N")||answer.equals("n")){
                            System.out.println("Don't lie. Your number is nine!");
                            }
                    }
                    else if(answer.equals("N")||answer.equals("n")){
                        System.out.print("Is your number three?");
                        if (answer.equals("Y")||answer.equals("y")){
                            System.out.println("YAY!!");
                            }    
                            else if (answer.equals("N")||answer.equals("n")){
                            System.out.println("Don't lie. Your number is three!");
                            }
                    }
                }
                else if(answer.equals("N")||answer.equals("n")){
                    System.out.print("Is the number greater than 6?  ");
                    answer = myScanner.nextLine();
                    if (answer.equals("Y")||answer.equals("y")){
                        System.out.print("Is your number seven?  ");
                        answer = myScanner.nextLine();
                        if (answer.equals("Y")||answer.equals("y")){
                            System.out.println("YAY!!");
                        }    
                        else if (answer.equals("N")||answer.equals("n")){
                            System.out.println("Don't lie. Your number is seven!");
                        }
                    }    
                    else if(answer.equals("N")||answer.equals("n")){
                        System.out.print("Is the number less than 3?  ");
                        answer = myScanner.nextLine();
                        if (answer.equals("Y")||answer.equals("y")){
                            System.out.print("Is your number one?  ");
                            answer = myScanner.nextLine();
                            if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                            }    
                            else if (answer.equals("N")||answer.equals("n")){
                            System.out.println("Don't lie. Your number is one");
                            }
                        }    
                        else if(answer.equals("N")||answer.equals("n")){
                            System.out.print("Is your number five?  ");
                            answer = myScanner.nextLine();
                            if (answer.equals("Y")||answer.equals("y")){
                                System.out.println("YAY!!");
                            }    
                            else if (answer.equals("N")||answer.equals("n")){
                            System.out.println("Don't lie. Your number is five");
                            }
                        }
                    
                    }
                }
            }    
        }//end of main method
    }//end of class