package homeWork5.task1;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Presenter presenter = new Presenter(model, view);
         presenter.input();
    }
}
