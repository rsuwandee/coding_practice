import java.util.Scanner;
/**
 * This Pig Latin application allows a user to enter a word and
 * return the Pig Latin version of the word.
 * @author Randy Suwandee
 */
public class Pig_Latin {

    /**
     * Main method calls the userInterface() method
     * @param args
     */
    public static void main(String[] args) {
        userInterface();
    }
    /**
     *This method create a Scanner input, prompts the user, and prints results
     *
     */
    public static void userInterface(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a word to be translated into pig latin: ");
        String input = console.nextLine();
        System.out.println("Your word in Pig Latin is: " + translate(input));
    }
    /**
     * This methods translates the string the user input
     */
    public static String translate(String input){
        if(input.length()<=0){
            return "ay";
        } else {
            return input.substring(1) + input.charAt(0) + "ay";
        }
    }
    
}
