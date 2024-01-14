import java.util.Scanner;

class E04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day:");
        int day = input.nextInt();

        System.out.println("Enter a month:");
        int month = input.nextInt();

        if (day == 24 && month == 12)
        {
            System.out.println("Merry Cristmas");
        }

        input.close();

    }
}