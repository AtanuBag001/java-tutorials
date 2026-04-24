public class Array {
    public static void main(String[] args) {
        //class of 500 students
        //you have to store marks of these 500 students
        //declaration and memory allocation together
        int [] marks = new int [5];
        //meomory used = 5 * 4 = 20 bytes/*
       /*  or 
       declaration before memory allocation
        int []marks;
        marks = new int [5];
         */
        //intilization
        marks [0] = 100;
        marks [1] = 100;
        marks [2] = 100;
        marks [3] = 100;
        marks [4] = 100;
        System.out.println(marks[4]);
        //declaration,memory allocation , initializtaion together 
        int [] marks2 = {22,44,55,55,66};
        System.out.println(marks2[3]);
    }
}
