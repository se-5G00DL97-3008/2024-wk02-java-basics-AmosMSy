import java.util.Scanner;

class E08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int number = 1;

        while (true)
        {
            System.out.println("Enter a number (0 to quit):");
            number = input.nextInt();

            if (number == 0)
            {
                break;
            }

            if ((number % 2) == 0)
            {
                System.out.println("Even number");
            }
            else
            {
                System.out.println("Odd number");
            }
        }

        input.close();

    }
}