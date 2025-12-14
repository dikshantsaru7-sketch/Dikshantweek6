import java.util.Scanner;
import java.util.Arrays; 

public class week6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] scores = new int[numSubjects];
        System.out.println("Enter the scores for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + " score: ");
            scores[i] = scanner.nextInt();
        }

       
        System.out.println("\nScores of the student:");
        for (int score : scores) {
            System.out.println(score);
        }

      
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("\nSum of all scores: " + sum);

      
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

        
        System.out.println("\nUpdated array of scores: " + Arrays.toString(scores));

        scanner.close(); 
    }
}