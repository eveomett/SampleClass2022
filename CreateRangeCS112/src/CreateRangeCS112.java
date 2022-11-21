import java.util.Arrays;

/** Create a linear sequence of numbers
 * Using arrays
 * @author Ellen Veomett
 */
public class CreateRangeCS112 {
    public static void main(String[] args) {
        Range myRange1 = new Range(10);  // This is:
        System.out.print("myRange1 is : " + myRange1 + "\n");

        Range myRange2 = new Range(2, 10, 2); // This is:
        System.out.print("myRange2 is : " + myRange2 + "\n");

        Range myRange3 = new Range(6,4,1); // This is:
        System.out.print("myRange3 is : " + myRange3 + "\n");

        Range myRange4 = new Range(-1); // This is:
        System.out.print("myRange4 is: " + myRange4 + "\n");

        myRange1.print();  // Different print
    }
}

/**
 * Range Class holds linear sequence of numbers
 * length is number of elements in sequence
 * elements is array of numbers
 */
class Range {
    int length;
    int[] elements;
    /**Constructs sequence of integers stepping by 1
     * @param num end of sequence from 0 to num (not inclusive)
     */
    Range(int num){
        length = Math.max(0, num);  // If num < 0 length is 0
        elements = new int[length];
        for (int i = 0; i<length; i++){
            elements[i] = i;
        }
    }

    /** Constructs linear sequence of integers
     * @param num1 first element in sequence
     * @param num2 end of sequence (not inclusive
     * @param step sequence step
     */
    Range(int num1, int num2, int step){
        length = Math.max(0, (num2-num1)/step); // if num1 > num2, length is 0
        elements = new int[length];
        for (int i = 0; i< length; i ++){
            elements[i] = num1 + i * step;
        }
    }

    /**
     * toString allows for printing w/ System.out.print()
     * @return string of elements array
     */
    public String toString(){
        return Arrays.toString(elements);
    }
    /** different print: no commas, no brackets
     */
    void print(){
        for (int item : this.elements){ // Different print
            System.out.print(item + " ");
        }
        System.out.print("\n");
    }
}