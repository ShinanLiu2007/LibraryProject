//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Book b1= new Book("Earthlings","Sayaka Murata",2021,false){}; This was just a test. (Yes the book does exist
        System.out.println("Welcome to our Library!\n");

        //Start page with the execution options
        System.out.println("""
                Please choose one of the following otions:
                1. Add a book
                2. Show all books
                3. Search for a book
                4. Borrow a book
                5. Return a book
                6. Exit""");

        //Introducing user input
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println(userChoice); // control test
        System.out.println("----------------------------------------\n"); // formating :)

        //Using user input to determine action (still not ready, here we introduce our methods. But i'll try and work on it tomorrow)
        switch(userChoice){
            case 1 -> System.out.println(userChoice);
            case 2 -> System.out.println(userChoice);
            case 3 -> System.out.println(userChoice);
            case 4 -> System.out.println(userChoice);
            case 5 -> System.out.println(userChoice);
            case 6 -> System.out.println(userChoice);
            default -> System.out.println(userChoice);
        }
    }
}