import java.util.HashSet;

//5.Write a Java program to compare two hash set.
public class Main5 {
    public static void main(String[] args) {
        HashSet<String> arr=new HashSet<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        System.out.println("Set 1: "+arr);
        HashSet<String> arr1=new HashSet<>();
        arr1.add("A");
        arr1.add("L");
        arr1.add("C");
        arr1.add("J");
        arr1.add("E");
        System.out.println("Set 2: "+arr1);
        boolean isEquals = arr.equals(arr1);
        System.out.println("By comparing two set is set1 and set2 equal? : "+isEquals);
    }
}