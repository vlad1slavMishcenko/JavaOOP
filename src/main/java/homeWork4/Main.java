package homeWork4;


import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(4);
        List<String> array1 = new ArrayList<>();
        array1.add("a");
        array1.add("b");
        array1.add("c");
        List<Double> array2 = new ArrayList<>();
        array2.add(5.8);
        array2.add(3.2);
        array2.add(2.5);


        GeneralizedMethod<Integer> generalizedMethod = new GeneralizedMethod<>();
        generalizedMethod.printElement(1);
        System.out.println(generalizedMethod.getMax(7,5)+ " max element");
        generalizedMethod.printArray(array);


        GeneralizedMethod<String> generalizedMethod1 = new GeneralizedMethod<>();
        generalizedMethod1.printElement("Hello");
        generalizedMethod1.printArray(array1);
        System.out.println(generalizedMethod1.getMax("hello", "bbb")+ " max element");


        GeneralizedMethod<Double> generalizedMethod2 = new GeneralizedMethod<>();
        generalizedMethod2.printElement(5.5);
        generalizedMethod2.printArray(array2);
        System.out.println(generalizedMethod2.getMax(5.9, 6.8)+ " max element");

    }




}
