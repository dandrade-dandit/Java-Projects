import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String name;
        
        System.out.println ("CSCI507 Course - Lab 01");
        HelloWorld();

        Scanner reader = new Scanner(System.in);
        System.out.print ("Enter your name: ");
        name = reader.nextLine();
        System.out.println("Hello " + name + "!");
    }

    public static void HelloWorld () {
        System.out.println("Hello World!");
    }
}

