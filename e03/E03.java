import java.util.Scanner;

class E03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userNumber = input.nextInt();

        if (userNumber < 0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Positive number");
        }

        input.close();

    }
}