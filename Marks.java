
import java.util.Scanner;


/**
 *
 * @author Malak
 */
public class Marks {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        int[] ph = new int[10];
        int[] ch = new int[10];
        int[] maths = new int[10];
        
        System.out.println("Please Enter the marks in Physics secured by the 10 students");
        for(int i = 0; i < ph.length; i++){
            ph[i] = input.nextInt();
        }
        
        System.out.println("Please Enter the marks in Chemistry secured by the 10 students");
        for(int i = 0; i < ch.length; i++){
            ch[i] = input.nextInt();
        }
        
        System.out.println("Please Enter the marks in Maths secured by the 10 students");
        for(int i = 0; i < maths.length; i++){
            maths[i] = input.nextInt();
        }
        
        double[] avg  = new double[10];
        
        for(int i = 0; i < 10; i++){
            avg[i]=(ph[i]+ch[i]+maths[i])/3.0;
        }
        
        int eightyAndAbove = 0 ;
        int thirtyAndBelow = 0;
        
        for(int i = 0; i < 10; i++){
            if(avg[i]>=80)
                eightyAndAbove++;
            else if(avg[i]<=30)
                thirtyAndBelow++;
        }
        
        System.out.println("Number of students securing 80% and above in aggregate is: " + eightyAndAbove);
        System.out.println("Number of students securing 30% and below in aggregate is: " + thirtyAndBelow);
        
        //this comment line is added to test some git commands
    }
}
