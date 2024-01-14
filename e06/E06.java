import java.util.Scanner;

class E06 {
    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);

        System.out.println("Which multiplication table to show?");
        int number = input.nextInt();

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i + " x " + number + " = " + (i*number));
        }

        input.close();
    }
}