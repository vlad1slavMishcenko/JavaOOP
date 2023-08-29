package task3;

public class Main {
    public static void main(String[] args) {

        Library lib = new Library();
        Book book = new Book("Евгений Онегин", "Пушкин");
        lib.addBook(book);
        Book book1 = new Book("Горе от ума" ,"Грибоедов");
        lib.addBook(book1);
        book1.setAvailable(false);
        Book book2 = new Book("Война и мир", "Толстой");
        lib.addBook(book2);
        Book book3 = new Book("Евгений Онегин", "Пушкин");
        lib.addBook(book3);
        lib.displayAvailableBooks();
        System.out.println("========================");
        lib.searchByAuthor("Достаевский");
        lib.searchByAuthor("Пушкин");
        System.out.println("===============================");
        book1.setAvailable(true);
        lib.displayAvailableBooks();

    }
}
