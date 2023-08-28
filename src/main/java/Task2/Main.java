package Task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int a = rectangle.calculateArea(rectangle.getWidth(), rectangle.getHeight());
        System.out.println(a);
        rectangle.setHeight(7);
        rectangle.setWidth(3);
        int b =rectangle.calculatePerimeter(rectangle.getWidth(), rectangle.getHeight());
        System.out.println(b);
    }
}
