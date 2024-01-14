import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);

        System.out.println("Which multiplicand multiplication table to show?");
        int multiplicand = input.nextInt();

        System.out.println("Until which multiplyer?");
        int multiplier = input.nextInt();

        for (int i = 1; i <= multiplier; i++)
        {
            System.out.println(i + " x " + multiplicand + " = " + (i * multiplicand));
        }

        input.close();
    }
}