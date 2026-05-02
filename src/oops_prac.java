
class employee1{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    
}

class cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void call(){
        System.out.println("calling...");
    }
}

class square {
    int side ;
    public int area(){
        return side * side ;
    }

    public int parameter(){
       return 4 * side;    }
}
class oops_prac{
 public static void main(String[] args) {
    //problem 1
    employee1 Atanu = new employee1();
    Atanu.setname("Atanu");
    Atanu.salary = 233;
    System.out.println(Atanu.getname());
    System.out.println(Atanu.getname());
    //problem 2
    cellphone oppo = new cellphone();
    oppo.ring();
    oppo.vibrate();
    oppo.call();

    //problem 3
    square sq = new square();
     sq.side = 3;
     System.out.println(sq.area());
     System.out.println(sq.parameter());
 }
}