package string_immutability;

public class StringImmutabilityDemo {

    public static void main(String[] args){

        //Demo 01
        String s1 =  new String("mrunmayi"); //creates a string object in heap(New keyword) ansd SCP
        String s2 = s1.toUpperCase();// CREATE A NEW OBJECT IN HEAP
        String s3 = s1.toLowerCase();// as there is no change in content of s1, no modification, it simply points to the same object as s1 in heap

        System.out.println(s1==s2);//returns false
        System.out.println(s1==s3);//return true

        //Demo 02
        String s4 = "Jagrut"; /*Creates an object directly in SCP as a string literal is used*/
        String s5 = s4.toString();//no modification in s4, hence point the same literal object in SCP that s4 points at

        System.out.println(s4==s5);//return true

    }
}
