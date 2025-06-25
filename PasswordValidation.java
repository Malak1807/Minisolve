import java.util.Scanner;
/**
 *
 * @author Malak Sohaib Salah 
 * ID number: 1098490
 */
public class PasswordValidation {
    
    public static void main (String[]args){
        //Creates Scanner object and prompts user to enter a password 
        Scanner input = new Scanner (System.in);
        System.out.print("Enter password: ");
        String password = input.nextLine();
        
        //Checks if the three rules are met 
        if (numberOfCharacters(password) && dataKind(password) && numberOfDigits(password))
            System.out.println("Valid Password");
        //Prints "Invalid Password" if one or more rule is not met
        else
            System.out.println("Invalid Password");
    }
    
    //Creates a method that checks if the number of characters is at least 8
    public static boolean numberOfCharacters (String s){
        if (s.length()<8)
            return false;
        else
            return true;
    }
    
    /*Creates a method that checks if at least one special character (from #,@,&) is used 
    besides letters, and numbers only*/
    public static boolean dataKind (String s){
        boolean validCharacters = false;
        
        for (int i = 0; i < s.length() ; i++){
            if (s.charAt(i) == '@' || s.charAt(i) == '#' || s.charAt(i) == '&' ){
                validCharacters = true; 
            }
            else if (!Character.isLetterOrDigit(s.charAt(i))){
                validCharacters = false;
                break;
            }
        }
        return validCharacters;
    }
    
    //Creates a method that checks if at least two digits are used
    public static boolean numberOfDigits (String s){
        boolean twoDigits = false; 
        int count = 0;
      
        for (int i = 0 ; i < s.length() ; i++){
            if (Character.isDigit(s.charAt(i)) )
                count ++;
            if (count == 2){
                twoDigits = true;
                break;
            }
        }
        
        return twoDigits;
    }
}
