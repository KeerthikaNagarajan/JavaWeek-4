import java.util.TreeSet;
//7.Write a Java program to retrieve and remove the last element of a tree set.
public class Main7 {
    public static void main(String[] args) {
        TreeSet<String> arr = new TreeSet<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        System.out.println("Original:" + arr);
        System.out.println("Removing the last element: "+arr.pollLast());
        System.out.println("Tree set after removing last element:"+arr);
    }
}
