import java.util.ArrayList;

//1.Write a Java program to join two array lists.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("hi");
        arr.add("how");
        arr.add("you");
        arr.add("doin'");
        System.out.println("String 1: "+arr);
        ArrayList<String> arr1=new ArrayList<String>();
        arr1.add("Joey");
        arr1.add("doesn't");
        arr1.add("share");
        arr1.add("food!");
        System.out.println("String 2: "+arr1);
        ArrayList<String> arr2=new ArrayList<String>();
        arr2.addAll(arr);
        arr2.addAll(arr1);
        System.out.println("Joined string: "+arr2);
    }
}