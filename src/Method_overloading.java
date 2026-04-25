public class Method_overloading {
     static void telljoke(){
        System.out.println("I invented a new word\n"+"plagiarism");
    }

static void change(int a){
    a = 60;
}

static void change2(int []arr){
    arr[0] = 98;
}

static void foo(){
    System.out.println("good morning");
}
static void foo(int a){
    //a is parameter
    System.out.println("good morning " +a);
}
  public static void main(String[] args) {
     //telljoke();
     
     //case 1 changing the integer
    //  int x = 45;
    //  change(x);
    //  System.out.println("The value of x after  runnin change is " +x);
    int [] marks = {10,20,30,40,50,60};
    change2(marks);
    System.out.println("the value of marks[0] after running change " + marks[0]);
    foo();
    foo(500);
    //500 is argument
    //argument are actual
  }
}
