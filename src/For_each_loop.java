public class For_each_loop{
    public static void main(String[] args){
        int [] marks = {98,45,79,99,88};
        // float [] marks = {98.7f,45.56f,79.0f,99.9f,88.9f};
        // String [] students = {"HARRY","SHUBHAM","ROHAN","LOVESH"};
        // System.out.println(students[2]);
        System.out.println(marks[1]);
        System.out.println(marks.length);
        //displaying the array (naive way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
    
    //displaying the array (for loop)
    System.out.println("printing using for loop");
    for (int i = 0; i<marks.length;i++){
        System.out.println(marks[i]);
    }
    System.out.println("Displaying the array in reverse order");
    for (int i = marks.length-1; i>=0;i--){
        System.out.println(marks[i]);
    }
    System.out.println("printing array using for each loop");//use when index is not neccesary
    
    for(int element : marks){
        System.out.println(element);
    }
}
}