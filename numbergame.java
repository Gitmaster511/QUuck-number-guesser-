import java.util.Random;
import java.util.Scanner;
  
public class numbergame{
  
    public static void main(String args[])
    {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(100);



        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Pick a number between 1-100!");
        System.out.println("Your guess:");
        String usersChoice = myObj.nextLine();  // Read user input
        int i=Integer.parseInt(usersChoice);  


        
  

        if (i == rand_int1) {
            System.out.println("Awesome Job! You got it!");
        }


        else if (i > 100 | i < 1) { 
            System.out.println("Please pick a number between 0-100 and try again :)");
        }
        
        else if (i != rand_int1) {
            System.out.println("Sorry that's not correct :(");
        }

       

        else {
            System.out.println("Please pick a number between 0-100 and try again :)");
        }



  
}
}







