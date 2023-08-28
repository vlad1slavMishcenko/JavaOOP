package Task2;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea(int width, int height){
        return width * height;
    }

    public int calculatePerimeter(int width, int height){
        return 2*(width + height);
    }



    public Rectangle() {
        this(5,10);

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
