public class q6 {

    public static void main(String[] args) {
        String[][] seats = new String[2][3];

        seats[0][0] = "Alice";
        seats[0][1] = "Bob";
        seats[0][2] = "Charlie";

      
        System.out.println("Seating Chart:");
        for (int row = 0; row < seats.length; row++) {
            System.out.print("Row " + (row + 1) + ": ");
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col] == null || seats[row][col].isEmpty()) {
                    System.out.print("[empty] ");
                } else {
                    System.out.print(seats[row][col] + " ");
                }
            }
            System.out.println(); 
        }
    }
}