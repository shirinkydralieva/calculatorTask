import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Amir(21343,234 ,2));
    }

    public  static double Amir(double num1, double num2, int action) {
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