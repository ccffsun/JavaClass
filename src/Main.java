public class Main {
    /*
    parameter passing : in Java always pass by value!! (not by reference, that means copy the object of reference!)
    primitives: copy the value in the memory
    reference : copy the object of reference in the memory, there are two references which match up with the same
    object.
     */

    public static void main(String[] args){
        System.out.println("Hello World!");
        int x = 5;
        changeValue(5); // when the method has done its work, x in the method(copy x=10) will
                           // be pop out and x in the field(original x=5) is still the original value 5.
        System.out.println(x);
    }

    public  static void changeValue(int x){
        x = 10;
    }

}
