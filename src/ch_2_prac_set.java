import java.util.Scanner;
public class ch_2_prac_set{
    public static void main(String[] args) {
        /*
        questions
        1)what will be the result of thw following expression 
        float a = 7/4 * 9/2

        2)write a java program to encrypt a grade by adding 8 to it.decrypt it to 
        show the correct grade

        3)use comparison operators to find out whether a number is greater the user 
        entered number or not
         */

        //1 answer 
        float a = 7/4.0f + 9/2.0f;
        System.out.println(a);
        //2 answer
        char grade = 'B';
        //encrypting the grade
        grade = (char)(grade + 8);
        System.out.println(grade);
        //decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        //3 answer
         Scanner st = new Scanner(System.in);
             int c = st.nextInt();
         System.out.println(c>8);
         st.close();
    }
}