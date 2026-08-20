import java.util.Scanner;

public  class strings{
    public static void main(String[] args) {
        //declaration
        // string name = new string ('harry');
        String name = "Atanu";
        System.out.print("The name is : ");
        System.out.println(name);
        int  a = 5;
        float b = 4.76f;
        //Sysytem.out.printf function
        System.out.printf("The value of a is %d and the value of b is %f ",a,b);
        //taking input
        Scanner sc = new Scanner(System.in);
       
        //String st = sc.next();it will take input but at print time it will print only one word
        //System.out.println(st);
        String sp = sc.nextLine();//take input as well as print the whole line
        System.out.println(sp);
    

    }
        
}
