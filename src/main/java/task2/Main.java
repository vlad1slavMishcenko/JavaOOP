package task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int a = rectangle.calculateArea();
        System.out.println(a);
        rectangle.setHeight(7);
        rectangle.setWidth(5);
        int b =rectangle.calculatePerimeter();
        System.out.println(b);
    }
}
