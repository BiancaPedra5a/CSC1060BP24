import java.util.Scanner;

public class InteractiveGreeter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Hello ! What is your name? ");
        String name = input.next();
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("Where are you from?");
        String location = input.next();
        System.out.println( "Hi " + name + "! from " + location);
        System.out.println("You are "+ age + " years old.");
        System.out.println("What is your favorite thing to do?");
        input.nextLine();
        String favorite = input.nextLine();
        System.out.println("Have fun next time you " + favorite +"!");
        System.out.println("How much would you like to donate today? ");
        double donation = input.nextDouble();
        System.out.println("You will donate " + donation + " today! Thank you very much! ");
    }
}
