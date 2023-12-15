

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  первое число: ");
        int scanNum1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int scanNum2 = scanner.nextInt();
        System.out.println("Выберите операцию:\n 1.+\n 2.-\n 3.*\n 4./ ");

        int choose = scanner.nextInt();


    }

    public static double sumAndDif(double firstNumber, double secondNumber, int action) {
        switch (action) {
            case 1:
                return firstNumber + secondNumber;
            case 2:
                return firstNumber - secondNumber;
            default:
                return 0;
        }
    }

    public static double divAndMulti(double num1, double num2, int action) {
        switch (action) {
            case 1:
                return num1 * num2;
            case 2:
                return num1 / num2;
            default:
                return 0;

        }
    }
}