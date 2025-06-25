
import java.util.Scanner;
/**
 *
 * @author Malak
 */
public class EvenArrayOddArray {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int[] list = new int[20];
        
        System.out.println("Enter 20 integers: ");
        for(int i = 0 ; i < 20 ; i++)
            list[i] = input.nextInt();
        
        int[] even = new int[20];
        int[] odd = new int[20];
        int e = 0;
        int o = 0;
        
        for(int i = 0; i < 20 ; i++){
            if(list[i]%2 == 0)
                even[e++] = list[i];
            else
                odd[o++] = list[i];
        }
        
        System.out.println("List of even numbers:");
        for(int i = 0 ; i < e ; i++)
            System.out.print(even[i] + " ");
        
        System.out.println();
        
        System.out.println("List of odd numbers:");
        for(int i = 0 ; i < o ; i++)
            System.out.print(odd[i] + " ");
        
        System.out.println();
        
    }
}
