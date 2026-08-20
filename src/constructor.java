
class myemployee{

private int id ;
private String name ;
  
myemployee(int myid , String myname ){
    id = myid ;
    name = myname;
}
myemployee(int myid   ){
    id = myid ;
    
}
public String getname() {
    return name ;
}

public void setname (String n){
    this.name = n;
}

public int getid() {
    return id ;
}

public void setid  (int id ){
    this.id  = id;
}


}

public class constructor {
    public static void main(String[] args) {
       
        myemployee atanu = new myemployee(12,"hii its atanu");
        // atanu.setid (23) ;
        // atanu.setname ("atanubag") ;
        System.out.println(atanu.getid());
        System.out.println(atanu.getname() );
    }
}
