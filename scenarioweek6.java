
/**
 * Write a description of class scenarioweek6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenarioweek6
{
    public static void main(String[] args)
    {
       String[][] seats = {{"Ashish ","Bhuvan", "Harsh"},{null, null, null}};

        for (int i = 0; i < 2; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                if (seats[i][j] == null || seats[i][j].isEmpty()) {
                    System.out.print("empty ");
                } else {
                    System.out.print(seats[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
