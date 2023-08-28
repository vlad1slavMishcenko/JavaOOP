package Task3;

public class Book {
    private String title;
    private String author;
    private boolean available ;


    public void displayInfo(){
        System.out.println("author: " + author + " title: " + title + " available: " + available);
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
}
