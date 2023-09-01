import java.util.Scanner;

/**
 *  My first hello world program
 *  I learned about command-line arguments also
 * @version 09.01.2023
 * @author 25moore
 */
public class FirstJava {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + ", have a great weekend");
        /*for(String s : args)
            System.out.println(s);*/
    }
}


/*
This is a
multi-line
comment
 */

// this is a single line comment

