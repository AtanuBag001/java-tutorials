public class String_methods {
    public static void main(String[] args) {
        String name = "Atanu";
        int val = name.length();
        System.out.println(val);
        //change the all uppercase character into lower case
        String name1 = name.toLowerCase();
        System.out.println(name1);
        //Change the all lowercase character into uppercase
         String name2 = name.toUpperCase();
        System.out.println(name2);
        String NonTrimmedString = "     Atanu     ";
        //System.out.println(NonTrimmedString.trim());
        String Trimmedstring = NonTrimmedString.trim();
        System.out.println(Trimmedstring);
        //print the string from the given index
        System.out.println(name.substring(2));
         System.out.println(name.substring(1,3));
         
    
    }
}
