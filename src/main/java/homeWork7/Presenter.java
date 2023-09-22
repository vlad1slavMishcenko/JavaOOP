package homeWork7;


public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Вызывает методы ввода данных и вызывает метод поиска введенной операции
     */
    public void start(){
        double firstNumber = view.getUserInputDouble();
        String operation = view.getUserInputString();
        double secondNumber = view.getUserInputDouble();
        searchOperation(firstNumber, operation, secondNumber);
    }

    /**
     * Метод поиска введенной операции
     * @param firstNumber первое число
     * @param operation операция
     * @param secondNumber второе число
     */
    public void searchOperation(double firstNumber, String operation, double secondNumber){
        for (MethodModel methodModel : model.listOperation) {
            if (methodModel.isAplicable(operation)){
                if(methodModel.calculate(firstNumber,secondNumber)) {
                    view.printResult(methodModel.getResult());
                }
                return;
            }

        }
        view.printError();
    }
}
