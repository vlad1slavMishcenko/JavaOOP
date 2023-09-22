package homeWork7.model;

import homeWork7.MethodModel;

public class Divide implements MethodModel {
    private double result;

    /**
     * Метод деления чисел
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @return возвращает истину если деление возможно
     */
    @Override
    public boolean calculate(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            result = firstNumber / secondNumber;
            return true;
        } else {
            System.out.println("Делить на ноль нельзя");
            return false;
        }
    }

    @Override
    public boolean isAplicable(String operation) {
        return "/".equals(operation);
    }

    public double getResult() {
        return result;
    }

}
