//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Book> bookList= new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    public static void addBook(){
        System.out.println("For adding a book please have the title, author and release year ready");
        System.out.println("Enter the title:");
        String title= scanner.nextLine();
        System.out.println("Enter the author(FIRST name, LAST name):");
        String author= scanner.nextLine();
        System.out.println("Enter the release year:");
        int year= scanner.nextInt();
        boolean borrowed= false;
        Book newBook= new Book(title,author,year,borrowed);
        bookList.add(newBook);
        }


    public static void main(String[] args) {

        // Book b1= new Book("Earthlings","Sayaka Murata",2021,false){}; This was just a test. (Yes the book does exist
        System.out.println("\nWelcome to our Library!\n");
        System.out.println("----------------------------------------\n"); // formating :)


        //Introducing user input !!!! USE A LOOP WITH RUNNING = TRUE, IFF EXIT, THEN RUNNING = FALSE -> LEAVE PROGRAM
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running){ //because we only want to exit once the user presses 6, we need a loop to keep giving them an option to chose from
            //Start page with the execution options
            System.out.println("""
                Please choose one of the following options:
                1. Add a book
                2. Show all books
                3. Search for a book
                4. Borrow a book
                5. Return a book
                6. Exit""");
            int userChoice = scanner.nextInt();

            //Using user input to determine action (still not ready, here we introduce our methods. But i'll try and work on it tomorrow)
            switch(userChoice){
                case 1 -> System.out.println(userChoice);
                case 2 -> System.out.println(userChoice);
                case 3 -> System.out.println(userChoice);
                case 4 -> System.out.println(userChoice);
                case 5 -> System.out.println(userChoice);
                case 6 -> {
                    System.out.println(userChoice);
                    running = false;
                }
                default -> System.out.println("Than is not a valid option, please enter another number");
            }
        }
        System.out.println("\n----------------------------------------\n");
        System.out.println("You have exited, thank you for visiting our library!");
    }
}