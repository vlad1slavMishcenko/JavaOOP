package homeWork6.task1;



//Использовал первую здачу из семинара 4 как базовый класс. Применил принцип открытости/закрытости
//Унаследовал функционал базового класса и добавил второе поле для создания экземпляра класса с двумя полями
// как во второй задаче и оставил возможность для расширения.

public class Container<T> {
            public Container(T firstItem) {
                this.firstItem = firstItem;

            }

            public T getFirstItem() {
                return firstItem;
            }

            public void setFirstItem(T firstItem) {
                this.firstItem = firstItem;
            }

            protected T firstItem;

            /**
             * метод печати типа поля класса
             */
            public void printType() {
                System.out.println("Тип элемента: " + firstItem.getClass().getName());

            }
}









