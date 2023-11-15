//import java.util.ArrayList;

/**
 * 
 */

public class Test {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers[1]);

        // ArrayList<Integer> number2 = new ArrayList<Integer>();
        // number2.add(10);
        // number2.add(20);
        // number2.add(30);
        // number2.add(40);
        // number2.add(50);
        // number2.add(60);
        // number2.get(0);


        MyArrayList<Integer> values = new MyArrayList<Integer>();
        // System.out.println("Count: "+ values.getCount() + ", Capacity: "+ values.getCapacity());
        // values.add(10);
        // System.out.println("Count: "+ values.getCount() + ", Capacity: "+ values.getCapacity());
        // values.add(20);
        // System.out.println("Count: "+ values.getCount() + ", Capacity: "+ values.getCapacity());
        // values.add(30);
        // System.out.println("Count: "+ values.getCount() + ", Capacity: "+ values.getCapacity());
        // values.add(40);
        // System.out.println("Count: "+ values.getCount() + ", Capacity: "+ values.getCapacity());
        // values.add(50);
        // System.out.println("Count: "+ values.getCount() + ", Capacity: "+ values.getCapacity());
        // values.add(60);

        // System.out.println(values.get(1));
        // values.set(1, 22);
        // System.out.println(values.get(1));

        values.add(10);
        values.add(20);
        values.add(30);
        values.display();

        values.addFront(1);
        values.addFront(2);
        values.addFront(3);
        values.display();

        values.insert(values.getCount(),7);
        values.display();
    } 
}