
import java.util.Random;
import java.util.Scanner;

public class guessthenumber{

    public static void main(String []args)
    {
        Random rand = new Random();

         Scanner Scanner = new Scanner(System.in);


        int randomnumber = rand.nextInt(100) + 1;
        
         System.out.println("enter your guess between 1 to 100");
         
        while(true)
        {
       

       
        
         int playerguess = Scanner.nextInt();
          
         if(playerguess == randomnumber){

         System.out.println("you guess the correct number");
         break;
         }
         
         else if(randomnumber > playerguess)
         {
            System.out.println(" the number is higher");
         }
         else 
         {
            System.out.println("the number is lower");
            
         }
        
        }
         

                 




    }
}