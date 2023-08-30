package homeWork2;

import java.util.LinkedList;

public interface MarketBehaviour extends IQueueBehaviour {


    void orderOut();

    void order(Buyer order);



    default void update(LinkedList queue){
        System.out.println("Количество заказов => " + queue.size());
    }


}
