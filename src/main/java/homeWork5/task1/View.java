package homeWork5.task1;

import java.util.Scanner;

public class View {
    /**
     * метод печати результата
     * @param result результат
     */
    public  void displayResult(double result){
        System.out.println("Результат: " + result);
    }

    /**
     * медод получает ввод данных от пользователя
     * @return возвращает введенное пользователем число
     */
    public int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }

    /**
     * метод выбора операции
     * @return возвращает введенное пользователем число
     */
    public int menu(){
        System.out.println("Выберете операцию: ");
        System.out.println("Нажмите 1 чтобы сложить");
        System.out.println("Нажмите 2 чтобы вычесть");
        System.out.println("Нажмите 3 чтобы умножить");
        System.out.println("Нажмите 4 чтобы разделить");
        return getUserInput();
    }

    /**
     * печать ошибки
     * @param errorMessage сообщение ошибки
     */
    public void error(String errorMessage){
        System.out.println("Ошибка: " + errorMessage);
    }
}
