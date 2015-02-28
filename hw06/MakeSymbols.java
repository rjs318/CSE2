//Rachel Shields
//CSE2 Professor Chen
//1-27-15
//The MakeSymbols program generates a random number between 0 and 100,
//if the random number is even, the program prints that number of “*” characters;
//if the number is odd, then the program prints out that number of “&” characters. 
public class MakeSymbols{
    public static void main(String[] args){
        int output = (int)(Math.random()*101);//creates random number between 0 and 100
        System.out.println("The random number geneated is: "+output);//prints the generated number
        String andStar = "";
        if(output%2==0){//if the output is even, then *s are printed
            do{//one * is added until the number of *s equals the output number
                andStar+="*";
                output--;
            }
            while(output!=0);
            System.out.println(andStar);//prints *s
        }
        else if(output%2!=0){//if the output is odd, then &s are printed
            do{//one & is added until the number of &s equals the output number
                andStar+="&";
                output--;
            }
            while(output!=0);
            System.out.println(andStar);//prints &s
        }
    }//end of main method
}//end of class