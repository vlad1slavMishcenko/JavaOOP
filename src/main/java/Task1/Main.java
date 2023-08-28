package Task1;


public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Vladislav");
        Cat cat = new Cat("Vasya", 2, owner.getName());
        Cat cat2 = new Cat("Barsik", 3);
        cat.greet();
        cat.setAge(7);
        cat.setName("Вася");
        cat2.greet();
        cat.greet();

    }
}