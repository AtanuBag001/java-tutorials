class employee{
  int id;
  int salary;
    String name;
    public void  printdetails (){
        System.out.println("My id is "+ id);
        System.out.println("My name is " + name);
    }
  public int getsalary(){
    return salary;
  }
    
}


public class custom_class {
    public static void main(String[] args) {
        System.out.println();
    System.out.println("welcome to our first custom class");

    employee Atanu = new employee();//instantiation a new employee object
    employee ravi = new employee();//instantiation a new employee object
    //setting attributes of atanu
    Atanu.id = 75;
    Atanu.salary = 26;
    Atanu.name = "Atanu";
    //printing attributes
    System.out.println(Atanu.id);
    System.out.println(Atanu.name);
    //printing attributes by calling method
    Atanu.printdetails();
//setting attributes for ravi
     ravi.id = 12;
    ravi.salary = 23;
    ravi.name = "ravi";
 //printing attributes by calling method
    Atanu.printdetails();
    ravi.printdetails();
    int salary = ravi.getsalary();
    System.out.println(salary);
       }
    }
    
