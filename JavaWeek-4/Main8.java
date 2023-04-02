import java.util.PriorityQueue;

//8.Write a Java program to convert a Priority Queue elements to a string representation.
public class Main8 {
    public static void main(String[] args) {
        PriorityQueue<String> arr = new PriorityQueue<String>();
        arr.add("Apple");
        arr.add("Bomb");
        arr.add("Cat");
        arr.add("Door");
        arr.add("Eat");
        arr.add("Fan");
        System.out.println("Original:"+arr);
        String x = arr.toString();
        System.out.println("String representation: "+x);

    }
}
