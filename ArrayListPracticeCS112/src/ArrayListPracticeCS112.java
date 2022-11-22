import java.util.ArrayList; // So we can declare an ArrayList
import java.util.Arrays; // So we can use Arrays.toString()


/** Practice with ArrayLists
 * Comparison to Arrays
 * @author Ellen Veomett
 */
public class ArrayListPracticeCS112 {
    public static void main(String[] args) {
        /**Basic Functionality
         */
        // declare a new ArrayList that contains base type Strings
        ArrayList<String> myStrings = new ArrayList<String>();
        // The base type (String here) is called the "type parameter"
        // Note: ArrayLists must contain *objects* and not *primitives*
        myStrings.add("When");
        myStrings.add("is");
        myStrings.add("lunch?");
        System.out.println(myStrings); // [When,  is , lunch?]
        System.out.println(myStrings.size()); // 3
        System.out.println(myStrings.get(1)); // is

        /**Comparison: Arrays, ArrayLists
        */
        int[] intArray = new int[2];
        ArrayList<Integer> intArrayList = new ArrayList<>();

        intArray[0] = -3;
        intArrayList.add(-3);  // autoboxing

        intArray[1] = 42;
        intArrayList.add(42);  // autoboxing

        intArray[0] = 99;
        intArrayList.set(0, 99);  // autoboxing

        System.out.println(intArray[1]);  // 42
        System.out.println(intArrayList.get(1));    // 42  (autoboxing)
        /**
        * printing
        */
        System.out.println(Arrays.toString(intArray));  // [99, 42]
        System.out.println(intArrayList);  // [99, 42]
        /**
         * for each usage
         */
        for (int element : intArray){  // 99 42
            System.out.print(element + " ");
        }
        for (Integer element : intArrayList){  // 99 42
            System.out.print(element + " ");
        }
        /**
        * ArrayLists and capacity vs size
        */
        int[] testArray = new int[5];
        ArrayList<Integer> testArrayList = new ArrayList<>(5);  // Initial size 0, initial *capacity* 5
        for (int i=0; i<5; i+=2){testArray[i] = i;} // compiler OK with this
        //for (int i=0; i<4; i++){testArrayList.set(i,i);} // compiler NOT OK with this
        //testArrayList.set(0,1); // compiler NOT OK with this either
        /**Remove Integer needs autoboxing
         */
        // intArrayList.remove(99);  // Will not compile!
        intArrayList.remove(Integer.valueOf(99));
    }
}
