public class Book {

    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String title, String author,int year, boolean borrowed){
        this.title= title;
        this.author= author;
        this.year= year;
        this.borrowed= false;// cos the book is usually available
    }


}
