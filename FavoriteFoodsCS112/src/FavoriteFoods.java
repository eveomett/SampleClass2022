import java.util.Arrays;
import java.util.ArrayList;

/**
 * Listing Favorite Foods with Arrays
 * @author Ellen Veomett
 */
public class FavoriteFoods {
    static void printFavs(String[] favs){
        int i=0;
        for (String fav : favs){
            System.out.println("My number "  + (i+1) + " favorite food is " + fav);
            i++;
        }
    }
    public static void main(String[] args) {
        String[] myFavoriteFoods = {"avocado", "pumpkin pie", "coffee", "popcorn", "pineapple"};
        printFavs(myFavoriteFoods);
        /*
         * Actually, I'm sick of pumpkin pie!  I want to remove it
         */
        /*
        for(int i=1; i<4; i++){
            myFavoriteFoods[i] = myFavoriteFoods[i+1];
        }
        myFavoriteFoods[4] = "";
        printFavs(myFavoriteFoods);
        */
        /*
         * Wait!  Ice cream should be number 1!
         */
        /*
        for (int i=4; i>0; i--){
            myFavoriteFoods[i] = myFavoriteFoods[i-1];
        }
        myFavoriteFoods[0] = "ice cream";
        printFavs(myFavoriteFoods);
        */
        /*
         * How do I add toast?!
         */
    }
}
