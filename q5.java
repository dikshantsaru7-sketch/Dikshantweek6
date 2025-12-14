public class q5 {
    public static void main(String[] args) {
        
        int[][] marks = new int[2][2];

        marks[0][0] = 80; 
        marks[0][1] = 75; 

        
        marks[1][0] = 90; 
        marks[1][1] = 85; 
        
      
        String[] subjects = {"Nepali", "English"};

        System.out.println("Student Marks Table:");
        System.out.println("          " + subjects[0] + "  " + subjects[1]);
        System.out.println("----------------------------------");


        for (int i = 0; i < marks.length; i++) {
            int totalMarks = 0;
            System.out.print("Student " + (i + 1) + ":   ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "    ");
                totalMarks += marks[i][j];
            }
            System.out.println("| Total: " + totalMarks);
        }
    }
}
