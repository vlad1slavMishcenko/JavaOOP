package homeWork5.task1;

public class Presenter {

    private Model model;
    private View view;


    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * вызывает метод ввода данных от пользователя и передает их
     * в метод выбора операции
     */
    public void input(){
        double num1 = view.getUserInput();
        int operation = view.menu();
        double num2 = view.getUserInput();
        calculate(num1, num2,operation);
    }

    /**
     * метод выбора операции
     * @param num1 первое число
     * @param num2 второе число
     * @param operation номер проводимой операции с числами
     */
    private void calculate(double num1, double num2, int operation) {

        switch (operation) {
            case 1 -> model.add(num1, num2);
            case 2 -> model.subtract(num1, num2);
            case 3 -> model.multiply(num1, num2);
            case 4 -> model.divide(num1, num2);
            default -> {
                view.error("Неверный ввод");
                return;
            }
        }
        view.displayResult(model.getResult());
    }
}
