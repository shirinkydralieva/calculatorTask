import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Put the first number - ");
        double firstNumber = scanner.nextInt();

        System.out.print("Put the second number - ");
        double secondNumber = scanner.nextInt();

        System.out.print("1.\"+\"\n2.\"-\"\nPut the action - ");

        int action = scanner.nextInt();

        switch (action){
            case 1:
                System.out.println("Result of sum = " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("Result of difference = " + (firstNumber - secondNumber));
            default:
                System.out.print("Wrong kind of action!");
        }

    }
}