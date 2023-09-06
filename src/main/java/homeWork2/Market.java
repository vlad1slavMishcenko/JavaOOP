package homeWork2;
import java.util.ArrayList;



public class Market implements MarketBehaviour {

    ArrayList<String> queue = new ArrayList<>();


    /**
     * метод добавления в очередь
     * вызывает метод выдачи заказа
     * @param order заказ
     */
    @Override
    public void add(String order) {
        queue.add(order);
        update(queue);

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
        displayOrders();
        clearOrders();

    }

    private void displayOrders() {
        for (String order: queue) {
            System.out.println("Ваш заказ => " + order);
        }
    }

    private void clearOrders() {
        queue.clear();
        update(queue);
    }

    /**
     * метод принемает заказ и вызывает метод добавления в очередь
     * MyFunctionalInterface проверяет поле order у объекта на наличие заказа
     * @param order заказ
     */
    @Override
    public void order(Buyer order) {
        MyFunctionalInterface<String> myFunctionalInterface = value -> value.isEmpty();
        boolean isEmptyOrder = myFunctionalInterface.checkingEmptyOrder(order.getOrder());

        if (isEmptyOrder){
                System.out.println("Ваш заказ пустой. Пожалуйста сделайте заказ!!! ");

        } else {
                add(order.getOrder());
            }


    }


}
