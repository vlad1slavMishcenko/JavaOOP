package homeWork7;

public interface MethodModel {

    /**
     * Метод математических операций
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @return возвращает истину или лож
     */
     boolean calculate(double firstNumber, double secondNumber);

    /**
     * Метод проверяет на совпадение операции
     * @param operation оперция
     * @return возвращает истину если находит совпадения
     */
     boolean isAplicable(String operation);

     double getResult();


}
