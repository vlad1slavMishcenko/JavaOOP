package Task1;

public class Cat {
    private String name;
    private int age;

    private String owner;


    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void greet(){
        if (owner == null){
            greet1();
        } else {
            greet2();
        }
    }
    private void greet1(){
        if (age > 4){
            System.out.println("Мяу! Меня зовут "+ name+ ". Мне "+ age+ " лет." );
        }else {
            System.out.println("Мяу! Меня зовут "+ name+ ". Мне "+ age+ " года." );
        }

    }

    private void greet2(){
        if (age > 4){
            System.out.println("Мяу! Меня зовут "+ name+ ". Мне "+ age+ " лет."+ " Мой владелец "+ owner);
        } else {
            System.out.println("Мяу! Меня зовут "+ name+ ". Мне "+ age+ " года."+ " Мой владелец "+ owner);
        }

    }
}
