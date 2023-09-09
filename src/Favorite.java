/**
 *  Ch 2 Homework file
 *  I learned how to use the Scanner class to interact with the user
 * @version 09.09.2023
 * @author 25moore
 */
import java.util.Scanner;
class Favorite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your favorite movie?");
        String movie = in.nextLine();
        System.out.println("I think " + movie + " is a terrible movie!");
        System.out.println("Just kidding! I like " + movie + " too.");
    }
}
