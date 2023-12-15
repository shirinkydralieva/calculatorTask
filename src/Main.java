import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(daniil(12,332,1));


    }

    public static double daniil(double firstNumber, double secondNumber, int action) {
        switch (action) {
            case 1:
                return firstNumber + secondNumber;
            case 2:
                return firstNumber - secondNumber;
            default:
                return 0;
        }
    }
}
