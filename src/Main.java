

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  первое число: ");
        double scanNum1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        double scanNum2 = scanner.nextInt();
        System.out.println("Выберите операцию:\n 1.+\n 2.-\n 3.*\n 4./ ");

        int choose = scanner.nextInt();

        while (choose != 0) {

            switch (choose) {
                case 1:
                    System.out.println(sumAndDif(scanNum1, scanNum2, 1));
                    break;
                case 2:
                    System.out.println(sumAndDif(scanNum1, scanNum2, 2));
                    break;
                case 3:
                    System.out.println(divAndMulti(scanNum1, scanNum2, 1));
                    break;
                case 4:
                    System.out.println(divAndMulti(scanNum1, scanNum2, 2));
                    break;
                case 0:
                    System.out.println("YOU'RE OUT");
                    break;
                default:
                    System.out.println("ERROR, TRY AGAIN!");
                    break;
            }
        }


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