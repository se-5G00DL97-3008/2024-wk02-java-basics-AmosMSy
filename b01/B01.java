import java.util.Scanner;

class B01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many bottles of beer? : ");
        int number = input.nextInt();

        for (int i = number; i > 2; i--)
        {
            System.out.printf("%d bottles of beer on the wall, %d bottles of beer.%n", i, i);
            System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.%n", (i-1));
        }
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer.");
        System.out.println("Take one down and pass it around, 1 bottle of beer on the wall");
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
        System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
        System.out.printf("No more bottles of beer on the wall, no more bottles of beer.%nGo to the store and buy some more, %d bottles of beer on the wall.", number);

        input.close();
    }
}