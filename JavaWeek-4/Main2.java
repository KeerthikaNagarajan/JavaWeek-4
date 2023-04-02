//2.Write a Java program to retrieve but does not remove, the first element of a linked list.
import java.util.LinkedList;
public class Main2
{
    public static void main(String[] args)
    {
        LinkedList <String> arr=new LinkedList<String>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        String x= arr.peek();
        System.out.println("Original: "+arr);
        System.out.println("First element: "+x);
    }
}