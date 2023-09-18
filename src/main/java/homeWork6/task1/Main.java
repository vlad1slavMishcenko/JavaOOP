package homeWork6.task1;

public class Main {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("First");
        Container<Integer> integerContainer = new Container<>(45);
        stringContainer.printType();
        integerContainer.printType();
        Pair<String, Integer> firstElement = new Pair<>("string", 34);
        firstElement.printType();
        Pair secondElement = new Pair<>(234,"string");
        secondElement.printType();


    }
}
