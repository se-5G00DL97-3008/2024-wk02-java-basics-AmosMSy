import java.util.Scanner;

class E02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give a number:");
        int firstNumber = input.nextInt();

        System.out.println("Give a another number:");
        int secondNumber = input.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));

        input.close();

    }
}