
import java.util.Scanner;
/**
 *
 * @author Malak Sohaib Salah
 * ID number: 1098490
 */
public class ReverseInput {
    public static void main (String [] args){
        
        //Prompts user to enter a number between 0 and 1000
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        
        //Gets the ones digit
        int d1 = number %10;
        
        //Gets the tens digit
        int d2 = number % 100 / 10;
        
        //Gets the hunderds digit
        int d3 = number / 100;
        
        //Computes a new integer 
        int newInteger = d1*100 + d2*10 + d3;
        
        //Displays user's input in reverse
        System.out.println("The input number in reverse is: " + newInteger);
    }
}
