package homeWork2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public interface MarketBehaviour extends IQueueBehaviour {


    void orderOut();

    void order(Buyer order);


    /**
     * метод обновляет очередь и сортирует по алфавиту заказы
     * @param queue список очереди
     */
    default void update(ArrayList<String> queue){
        Comparator<String> comparator = Comparator.comparing(order -> order);
        Collections.sort(queue, comparator);
        System.out.println("Количество заказов => " + queue.size());
    }


}
