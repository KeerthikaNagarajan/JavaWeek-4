//3.Write a Java program to check if a particular element exists in a linked list.
import java.util.LinkedList;
public class Main3
{
    public static void main(String[] args)
    {
        LinkedList <String> arr=new LinkedList<String>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        System.out.println("Original: "+arr);
        if(arr.contains("A")){
            System.out.println("A - The element exists");
        }
        else{
            System.out.println("A - The element does not exists");
        }
        if(arr.contains("I")){
            System.out.println("I - The element exists");
        }
        else{
            System.out.println("I - The element does not exists");
        }
    }
}