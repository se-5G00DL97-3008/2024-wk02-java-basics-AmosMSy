import java.util.Scanner;
import java.util.ArrayList;

class E09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        float average;
        float score = 0;
        ArrayList<Float> scores = new ArrayList<Float>();
        float sum;

        while (true)
        {
            System.out.println("Give a test score (-1 to quit):");
            score = input.nextFloat();

            if (score == -1)
            {
                break;
            }

            scores.add(score);

            sum = 0;
            for(Float value : scores)
            {
                sum += value;
            }
            average = (sum / scores.size());

            System.out.println("Average: " + average);

        }

        input.close();

    }
}