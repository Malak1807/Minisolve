import java.util.Scanner;
/**
 *
 * @author Malak Sohaib Salah 
 * ID number: 1098490
 */
public class PyramidOfNumbers {
    public static void main (String[]args){
        //Creates Scanner object
        Scanner input = new Scanner (System.in);
        
        //Declares variable i to store the number of lines of the pyramid
        int i;
        
        //Prompts user to enter a number from 5 to 10 for the number of lines of the pyramid
        do{
        System.out.print("Enter the number of lines (from 5 to 10): ");
        i = input.nextInt();
        if(i < 5 || i > 10)
            System.out.println("Invalid number.");
        }while(i < 5 || i > 10);
        
        //Declares variable n
        int n;
        
        //Loop with nested loops that print and format digits and spaces to build a pyramid
        for(int k = 1; k<=i ; k++){
            for (n = 0; n < i-k ; n++){
                System.out.printf("%3s"," ");
            }
            for (n = k; n>=1 ; n--){
                System.out.printf("%3d",n);
            }
            for (n = 2 ; n<=k ; n++){
                System.out.printf("%3d", n);
            }
            System.out.println();
        }
        
    }
}
