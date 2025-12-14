import java.util.Scanner;

/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        String[][]seats=new String[2][3];
        
        int i,j;
        for(i=0;i<2;i++)
        {
            System.out.println("Eneter the students in row "+(i+1));
            for(j=0;j<3;j++)
        {
            System.out.println("enter the students in colmun"+(j+1));
            seats[i][j]=s.nextLine();
        }
        }
        System.out.println("Students are");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
            if(seats[i][j].equals("0"))
            {
                seats [i][j]="Empty";
                
                
        }
        System.out.print(seats[i][j]+"\t");
        System.out.println();
    }
    
    }
}
}