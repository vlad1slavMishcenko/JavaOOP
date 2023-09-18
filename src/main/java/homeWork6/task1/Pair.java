package homeWork6.task1;

//Унаследованный класс с добавленным полем
    public class Pair<T, U> extends Container {
        protected U secondItem;


        public Pair(T firstItem, U secondItem) {
            super(firstItem);
            this.secondItem = secondItem;
        }


        /**
         * переопределенный метод печати типа поля класса
         */
        @Override
        public void printType() {
            System.out.println("Тип первого элемента: " + firstItem.getClass().getName());
            System.out.println("Тип второго элемента: " + secondItem.getClass().getName());

        }

        public U getSecondItem() {
            return secondItem;
        }

        public void setSecondItem(U secondItem) {
            this.secondItem = secondItem;
        }

}
