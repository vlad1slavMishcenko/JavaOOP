package homeWork7;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        model.initializationList();
        View view = new View();
        Presenter presenter = new Presenter(model, view);
        presenter.start();
    }
}
