

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

        int num = 0;
        while (num != 0) {

            switch (num) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
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
}