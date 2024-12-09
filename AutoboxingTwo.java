// import all files from java.util package
import java.util.*;

// another autoboxing example -- implicitly convert primitive to corresponding wrapper class
public class AutoboxingTwo {
    // standard static main() method w/ void return type (no return statement)
    public static void main(String[] args){
        // initialize char w/ value 'z'
        char zeta = 'z';
        // (1) 'autoboxing' primitive 'char' -> wrapper class 'Character' obj
        Character zz = zeta;

        // display 'zz' data type using .getClass() & .getSimpleName() built-in methods
        System.out.println(zz.getClass().getSimpleName());  // Character

        // create an ArrayList<> of Integer wrapper class obj (notice: 'new')
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // (2) 'autoboxing' primitive int value 808 to Integer wrapper class type ...
        // as arrayList only t akes in Integer objs
        arrayList.add(808);

        // print out values from obj @ 1st index
        System.out.println(arrayList.get(0));
    }
}
