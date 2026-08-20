class Base {
    int x;

    public int getx() {
    return x ;
}

public void setx (int x ){
    System.out.println("i am now setting x");
    this.x = x;
}

     public void printme(){
        System.out.println("i am a constructor");
     }
}

class derived extends Base{
        
    int y;
    public int gety() {
    return y ;
}

public void sety (int y ){
    this.y = y;
}
}
public class inheritance{
    public static void main(String[] args) {
       //creating an object of base class
        Base b = new Base ();
        b.setx(6);
        System.out.println(b.getx());

        //creating an object of derived class
        derived d = new derived();//derived use kore base er function access kora jabe
        d.setx(56);
        System.out.println(d.getx());
    }
}