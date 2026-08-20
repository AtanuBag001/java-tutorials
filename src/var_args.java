public class var_args{

    static int sum (int ...arr){
        //availabe as int [] arr
        int res = 0 ;
        for (int a : arr){
            res += a ;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("The sum of nothing is " + sum());
        System.out.println("The sum of 4,5 is " + sum(4,5));
        System.out.println("The sum of 4 and 5 and 3 is " + sum(4,5,3));
        System.out.println("The sum of 4,5,6,7 is " + sum(4,5,6,7));
    }
}