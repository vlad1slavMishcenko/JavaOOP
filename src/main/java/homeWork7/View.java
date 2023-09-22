package homeWork7;

import java.util.Scanner;

public class View {

    /**
     * Метод для ввода данных с клавиатуры
     * @return возвращает введенные данные
     */
    public double getUserInputDouble(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextDouble();
    }

    /**
     * Метод для ввода данных с клавиатуры
     * @return возвращает введенные данные
     */
    public String getUserInputString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию: ");
        return scanner.next();
    }

    /**
     * Метод выводит результат в консоль
     * @param result результат вычислений
     */
    public void printResult(double result){
        System.out.println("Результат равен: "+ result);
    }

    /**
     * Выводит ошибку в консоль
     */
    public void printError(){
        System.out.println("Операция не определена!");
    }
}
