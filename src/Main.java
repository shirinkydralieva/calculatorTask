


public class Main {
    public static void main(String[] args) {



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
