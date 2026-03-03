
import java.util.Scanner;

public class User_input_05 {
public static void main(String[] args){
    System.out.println("taking input from the user");
    Scanner sc = new Scanner(System.in);
   // System.out.println("Enter number 1");
   // int a = sc.nextInt();
    //float a = sc.nextFloat();
   // System.out.println("Enter number 2");
    // int b = sc.nextInt();
    //float b = sc.nextFloat();
   // float sum = a + b ;
    /*System.out.println("The sum of these numbers is ");
    System.out.println(sum);
    System.out.println("Enter a number again");
    boolean b1 = sc.hasNextInt();
    System.out.println(b1);*/
    //String str = sc.next();//reads only first word
    String str = sc.nextLine();//reads whole line
    System.out.println(str);
  }
}
