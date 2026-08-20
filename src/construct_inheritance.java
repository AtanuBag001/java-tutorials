
class Base1 {
    Base1(){
       System.out.println("i am a constructor");
    }
    Base1(int a){
        System.out.println(" i am a overloaded contructor with value of a as " + a);
    }
}

class derived extends Base1{
       derived(){
        super(5);//super keyword is used to call the base class constructor with argument
        System.out.println("i am derived class constructor");
       } 
       derived(int a , int b){
        super(a);//super keyword is used to call the base class constructor with argument
        System.out.println("i am derived class constructor with value of b as " + b);
       }

   
}

class childofderived extends derived{
    childofderived(){
        System.out.println("i am child of derived class constructor");
    }

    childofderived(int a , int b , int c ){
        super(a,b);//super keyword is used to call the base class constructor with argument
        System.out.println("i am child of derived class constructor with value of c as " + c);
    }
}
public class construct_inheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1() ;
        // base const with no argument will be call automatically if we didnot use super keyword when derived will be call 
        // and then derived const will also call
     //derived d = new derived() ;
     childofderived c = new childofderived(5,6, 7) ;
    }
}
     

