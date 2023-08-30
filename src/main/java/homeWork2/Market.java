package homeWork2;
import java.util.LinkedList;

public class Market implements MarketBehaviour {

    LinkedList<String> queue = new LinkedList<>();

    /**
     * метод добавления в очередь
     * вызывает метод выдачи заказа
     * @param order заказ
     */
    @Override
    public void add(String order) {
        queue.add(order);
        update(queue);
        remove();
    }

    @Override
    public void remove() {
        orderOut();
    }

    /**
     * метод вынемает заказы из очереди и обновляет очередь
     */
    @Override
    public void orderOut() {
        while (queue.size() > 0) {
            System.out.println("Ваш заказ => " + queue.element());
            queue.remove();
            update(queue);
        }
    }

    /**
     * метод принемает заказ и вызывает метод добавления в очередь
     * @param order заказ
     */
    @Override
    public void order(Buyer order) {
        add(order.getOrder());

    }


}
