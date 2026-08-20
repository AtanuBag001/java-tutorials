
class myEmployee{
   private int id;
    private String name;
//getter method is used to get the value of a variable
    public String getname(){
        return name;
    }
//setter method is used to set the value of a variable
    public void setname(String n){
        name = n;
    }

    public int getid(){
        return id;
    }

    public void setid(int i){
        id = i;
    }
}

public class gettter_setter {
    public static void main(String[] args) {
        myEmployee atanu = new myEmployee();
        //atanu.id = 45;
        //atanu.name = "Atanu";---> this will give error because id and name are private
        atanu.setid(45);
        atanu.setname("Atanu");//---> this is the correct way to set the values of id and name
        System.out.println("The id of the employee is: " + atanu.getid());
        System.out.println("The name of the employee is: " + atanu.getname());
    }
}
