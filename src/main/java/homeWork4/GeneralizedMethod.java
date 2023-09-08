package homeWork4;


import java.util.List;


public class GeneralizedMethod<T extends Comparable> {

    /**
     * метод печати элемента
     * @param element элемент для печати
     */
    public void printElement(T element){
        System.out.println(element.getClass().getTypeName()+ "  " + element);
    }


    /**
     * метод печати списка
     * @param list список для печати
     */
    public void printArray(List<T> list){
        for (T element: list) {
            System.out.println(element);
        }
    }


    /**
     * метод возвращает найбольший элемент
     * @param element1 элемент сравнения
     * @param element2 элемент сравнения
     * @return возвращает найбольший элемент
     */
    public T getMax(T element1, T element2){
       if (element1.compareTo(element2) > 0){
           return element1;
       } else {
           return element2;
       }

    }
}
