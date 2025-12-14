import java.util.Arrays;
import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] initialScores = {10, 20, 30, 40, 50};
        System.out.println("Initial scores: " + Arrays.toString(initialScores));

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] scores = new int[numSubjects];

        System.out.println("Enter the scores for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

  
        System.out.println("Updated scores: " + Arrays.toString(scores));

        System.out.println("\nIndividual Scores:");
        for (int score : scores) {
            System.out.println(score);
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("Sum of scores: " + sum);

        double average = (double) sum / numSubjects;
        System.out.println("Average score: " + String.format("%.2f", average));

        int highestScore = scores[0];
        int lowestScore = scores[0];

        for (int i = 1; i < numSubjects; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
            }
            if (scores[i] < lowestScore) {
                lowestScore = scores[i];
            }
        }
        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);

        scanner.close();
    }
}