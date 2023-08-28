package Task3;

public class Main {
    public static void main(String[] args) {

        Library lib = new Library();
        Book book = new Book("Евгений Онегин", "Пушкин");
        lib.addBook(book);
        Book book1 = new Book("Горе от ума" ,"Грибоедов");
        lib.addBook(book1);
        book1.setAvailable(false);
        Book book2 = new Book("Война и мир том 3", "Толстой");
        lib.addBook(book2);
        Book book3 = new Book("Евгений Онегин", "Пушкин");
        lib.addBook(book3);
        lib.displayAvailableBooks();

        lib.searchByAuthor("dfg");
        lib.searchByAuthor("Пушкин");

    }
}
