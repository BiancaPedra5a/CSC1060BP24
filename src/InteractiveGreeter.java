import java.util.Scanner;

public class InteractiveGreeter {
    public static void main(String[] args) {
        // created scanner to take input from user
        Scanner input = new Scanner (System.in);
        // output to screen ask for name
        System.out.println("Hello ! What is your name? ");
        // take input and set it to variable name
        String name = input.next();
        // output to screen ask for age
        System.out.println("How old are you?");
        // take input and set it to variable age
        int age = input.nextInt();
        System.out.println("Where are you from?");
        String location = input.next();
        // output to screen ask for location
        System.out.println( "Hi " + name + "! from " + location);
        // take input and set it to variable location
        System.out.println("You are "+ age + " years old.");
        // output to screen ask for favorite hobby
        System.out.println("What is your favorite thing to do?");
        //Clear scanner que
        input.nextLine();
        // take input and set it to variable favorite
        String favorite = input.nextLine();
        System.out.println("Have fun next time you " + favorite +"!");
        System.out.println("How much would you like to donate today? ");
        // take input and set it to variable donation
        double donation = input.nextDouble();
        // output to screen donation amount
        System.out.println("You will donate " + donation + " today! Thank you very much! ");
    }
}
