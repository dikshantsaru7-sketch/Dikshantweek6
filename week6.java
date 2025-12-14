
/**
 * Write a description of class week6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6
{
    public static void main(String[] agrgs)
    {
        int[] age; // declaring an array 
        age = new int[5]; // constructing an array 
        
        System.out.println(age.length);
        
        age[0]=10;
        age[1]=20;
        age[2]=30;
        
        
        int firstElement= age[0];
        
        System.out.println(firstElement);
        
        int[] agr= {5,10,15,20,25};
        
        int start=0;
        int end=agr.length-1;
        
        for(int i=start;i<=end;i++)
        {
            System.out.println(agr[i]);
        }
        int enbd1=0;
        int start1=agr.length-1;
        
        for(int i=end;i<=start;i--)
        {
            System.out.println(agr[i]);
        }
         System.out.println(firstElement);
         int[] agg={5,10,15,20,25};
         int [] [] matrix={ {1,2,3} ,{4,5,6}, {7,8,9}};
         System.out.println(matrix[0][1]);
         
         
         for (int i=0; i<=matrix.length-1;i++)
         {
            for(int j=0; j<= matrix[i].length -1; j++)
            {
                System.out.print(matrix[i][j]);
         }
          System.out.println();
    }
}
}