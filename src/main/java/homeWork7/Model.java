package homeWork7;

import homeWork7.model.Add;
import homeWork7.model.Divide;
import homeWork7.model.Multiply;
import homeWork7.model.Subtract;

import java.util.ArrayList;

public class Model {
    ArrayList<MethodModel> listOperation = new ArrayList<>();

    /**
     * Метод создает объекты и добавляет их в список операций
     */
    public void initializationList(){
        Add add = new Add();
        Divide divide = new Divide();
        Subtract subtract = new Subtract();
        Multiply multiply = new Multiply();
        listOperation.add(add);
        listOperation.add(divide);
        listOperation.add(subtract);
        listOperation.add(multiply);
    }
}
