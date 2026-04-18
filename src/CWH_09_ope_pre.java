public class CWH_09_ope_pre {
    public static void main (String[] args){
       // int  a = 6*5-34/2;
        /*
        highest precedence goes to 8 and / they are thrn evaluated on the basis of left to right associativity
        30-34/2
        30-17
        =13
        */
       //int  b = 60/5-34*2;
        /*
        * and / associativity left to right
        *= 12 - 34*2
        * = 12 - 68
        * = -58
        */
        //System.out.println(a);
        //System.out.println(b);
        //Quick Quiz
        int x = 6;
        int y = 1;
        int k = x * y/2;
        System.out.println(k);
        int b = 1;
        int c = 4;
        int a = 5;
        int t = b*b - (4*a*c)/(2*a);
        System.out.println(t);
    }
}
