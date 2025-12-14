import java.util.Scanner;

/**
 * Write a description of class week6_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6_2
{
    public static void main(String[] args){
String[] name={"Saroj","Sushant","Ujjwal","Rabina","Sandesh"};
for(int i=0;i<=name.length-1; i++){
    System.out.println(name[i]);
}
System.out.println("2nd index:"+name[2]);
Scanner input=new Scanner(System.in);
System.out.println("ask for input (0-4)");
int idx= input.nextInt();
input.nextLine();
System.out.println("pass the value for index");
String value= input.nextLine();
name[idx]= value;
System.out.println(name[idx]);
}
}