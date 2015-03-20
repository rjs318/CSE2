//Rachel Shields
//CSE2 Professor Chen
//3-18-15
//The HW8 program creates a short game that depends on the user's input. 
//
import java.util.Scanner;
    public class HW8{
        public static void giant(){
            System.out.println("                                 ---------                    ");
            System.out.println("                                |  /    \\|                   ");
            System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
            System.out.println("                           H     -----------   H              ");
            System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
            System.out.println("                           H    HHHHHHHHHHH    H                      ");
            System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
            System.out.println("                                HHHHHHHHHHH                   ");
            System.out.println("                                HHH     HHH                   ");
            System.out.println("                               HHH       HHH                   ");
        }
        public static void cave(){
             System.out.println("                              *****   * * * * * * * *        ");
            System.out.println("                         ***         ***                      ");
            System.out.println("                      ***               ***                   ");
            System.out.println("                 |    ***               ***                   ");
            System.out.println("                 |    ***               ***                   ");
            System.out.println("             O __|__  ***               ***                   ");
            System.out.println("           ******l    ***               ***                   ");
            System.out.println("            * *       ***               ***                   ");
            System.out.println("           *   *      ********************* * * * * * *       ");
        }
        public static void box(){
            System.out.println("                     *********************     *********************    *********************             ");
            System.out.println("                     ***               ***     ***               ***    ***               ***              ");
            System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
            System.out.println("                     ***               ***     ***               ***    ***               ***              ");
            System.out.println("                     *********************     *********************    *********************               "); 
        }
        public static String getInput(Scanner scan, String string){//getInput method with two parameters
            String answer =scan.nextLine();
            if(!answer.equals("C")&&!answer.equals("c")){
                System.out.println("Yea right LOSER!");
                System.exit(0);//if input is not C or C, program quits
            }
        
            return string;
        }
        public static String getInput(Scanner scan, String string, int trial){//getInput method with three parameters
            String answer = scan.nextLine();
            int critcount=0;//keeps track of how many critical hits the user has
            while(critcount<trial){//runs while the user doesn't have enough critical hits to kill giant
                if(!answer.equals("A")&&!answer.equals("a")&&!answer.equals("E")&&!answer.equals("e")){
                    //if input is not A,a,E, or e, the program exits
                    System.out.println("You were executed by the GIANT! Game Over!");
                    System.exit(0);
                }
                else{
                    if(answer.equals("A")||answer.equals("a")){//if answer is A or a, Attack
                            int fightResult=(int)(Math.random()*2);//randomly generates either 0 or 1
                            if(fightResult==1){//if the random number generated is 1
                                critcount++;//the number of critical hits is incremented
                                System.out.println("Critical Hit!");
                            }
                            else{//if the random number generated is 0, the user misses and 
                            //the number of critical hits is not incremeneted
                            System.out.println("You missed!");
                                
                            }
                    }
                    else if(answer.equals("E")||answer.equals("e")){//if answer is E or e, attempt escape
                            int escResult=1+(int)(Math.random()*11);//generates random number from 1 to 10
                            if (escResult==10){//if the number generated is 10, the user escapes. 
                                System.out.println("You escaped!");
                                critcount=trial;//and loop is exited 
                            }
                            else{//if number is not 10, user is prompted again
                                System.out.println("You failed to escape!");
                            }
                    }
                }
                if(critcount!=trial){//user reprompted while the critical hits is not equal to trial
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                answer=scan.next();
                }
            }
            return string;
        }//end of method
        public static String getInput(Scanner scan){//getInput method with one parameter
            if(!scan.hasNextInt()){//checks for int input and quits if input is not an int
                System.out.println("That's not even a choice! You get NOTHING!");
                System.exit(0);
            }
            int answer = scan.nextInt();
            String a="";
            switch(answer){//prints what is in the box chosen by the user
                case 1: System.out.println("IT'S BEYONCE!!! ");
                break;
                case 2: System.out.println("IT'S A LIFETIME SUPPLY OF BEN AND JERRY'S!!! ");
                break;
                case 3: System.out.println("IT'S YOUR COLLEGE TUITION!!! ");
                break;
                default: System.out.println("A wrong number!? You get nothing! ");
                break;
            }
            return a;
        }
        public static void main(String[] args){
            char option;
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            String input = getInput(scan, "Cc");//calls the getInput method with two parameters
            System.out.println("You are in a dead valley.");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");//calls the getInput method with two parameters
            System.out.println("You walked and walked and walked and you saw a cave!");
            cave();////calls cave method 
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");//calls the getInput method with two parameters
            System.out.println("You entered a cave!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");//calls the getInput method with two parameters
            System.out.println("Unfortunately, you ran into a GIANT!");
            giant();//calls giant method
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            input = getInput(scan, "AaEe", 10);//calls the getInput method with three parameters
            System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
            System.out.println("There are three 3 tressure boxes in front of you! Enter the box number you want to open!");
            box();//calls box method
            input = getInput(scan);//calls the getInput method with one parameter
            System.out.println("Hero! Have a good day!");
        }//end of main method
    }//end of class 