import java.util.HashSet;
//4.Write a Java program to remove all of the elements from a hash set.
public class Main4
{
    public static void main(String[] args)
    {
        HashSet<String> arr=new HashSet<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        System.out.println("Original: "+arr);
        arr.clear();
        System.out.println("Removed all the elements from the list: "+arr);
    }
}