import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        Scanner input = new Scanner (System.in);
        System.out.println("Measurement in INCHES?");
        int inches = input.nextInt();
        System.out.println( inches * CM_PER_INCH + " centimeters");

    }
}
