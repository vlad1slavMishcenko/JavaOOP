package task3;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book book){
        catalog.add(book);
    }

    public void removeBook(Book book) {
        if (catalog.equals(book)){
            catalog.remove(book);
        } else {
            System.out.println("Книга не найдена!");
        }
    }

    public void displayAvailableBooks(){
        for (int i = 0; i < catalog.size(); i++){
            if (catalog.get(i).isAvailable() == true) {
                System.out.println(catalog.get(i));
            }
        }
    }

    public void searchByAuthor(String name ){
        for (int i = 0; i < catalog.size();i++)
        if (catalog.get(i).getAuthor() == name){
            System.out.println(catalog.get(i));
        }
    }

}
