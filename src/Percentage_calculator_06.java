import java.util.Scanner ;
public class Percentage_calculator_06 {
    public static void main(String[] args){
        float sub1,sub2,sub3,sub4,sub5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subject1");
        sub1 = sc.nextFloat();
        System.out.println("Enter number of subject2");
        sub2 = sc.nextFloat();
        System.out.println("Enter number of subject3");
        sub3 = sc.nextFloat();
        System.out.println("Enter number of subject4");
        sub4 = sc.nextFloat();
        System.out.println("Enter number of subject5");
        sub5 = sc.nextFloat();
        float total =  sub1+sub2+sub3+sub4+sub5;
        float fullmarks = 500;
        float percentage = (total*100)/500;
        System.out.println(percentage);

    }
}
