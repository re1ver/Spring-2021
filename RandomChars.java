//Author: Jarod Armstrong
//Date: March 13, 2021
//This program will prompt the user to input a number and then generate a random uppercase letter, lowercase letter, and number based on that seed. 

import java.util.Scanner;

import java.util.Random;


public class RandomChars {

   public static void main(String[] args) {
   
         makeRandoms();       //prompt user for seed and generate all random outputs
         
   } 

         public static void makeRandoms() {
         
               Scanner scanner = new Scanner(System.in);
               
               System.out.println("Enter a seed for the random number generator:");    //prompt user to input an integer seed
           
               int seed = scanner.nextInt();                                           //store user input in variable 'seed'
               
                 
               
               
               Random random = new Random();
               char upper = (char)('A' + random.nextInt(26));        //generate random uppercase letter 
               
               System.out.println("RANDOM:");               
               System.out.print("Uppercase = ");                     //print random uppercase letter            
               System.out.println(upper);
               
               
               
               char lower = (char)('a' + random.nextInt(26));        //generate random lowercase letter
               
               System.out.print("Lowercase = ");
               System.out.println(lower);                            //print random lowercase letter
               
               
               System.out.print("Digit = ");
               System.out.print(random.nextInt(10));                 //generate and print a ramdom number between 0 and 9
               
                                    
         
         
               scanner.close();
         
         
         }
         
         
         
}
