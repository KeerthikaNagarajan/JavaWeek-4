# JavaWeek-4
### 1.Write a Java program to join two array lists.
### CODE
```
import java.util.ArrayList;
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
```
### OUTPUT
<img width="403" alt="image" src="https://user-images.githubusercontent.com/93427089/229344087-079409c2-4c21-430c-a581-e740cb13d4b2.png">

### 2.Write a Java program to retrieve but does not remove, the first element of a linked list.
### CODE
```
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
```
### OUTPUT
<img width="180" alt="image" src="https://user-images.githubusercontent.com/93427089/229344215-9cdf4a0d-53ea-4150-a50d-fb1c7f1cf5ec.png">

### 3.Write a Java program to check if a particular element exists in a linked list.
### CODE
```
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
```
### OUTPUT
<img width="201" alt="image" src="https://user-images.githubusercontent.com/93427089/229344264-d6c78a52-b68b-49c3-9a60-816a21fa95fd.png">

### 4.Write a Java program to remove all of the elements from a hash set.
### CODE
```
import java.util.HashSet;
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
```
### OUTPUT
<img width="272" alt="image" src="https://user-images.githubusercontent.com/93427089/229344339-74344be7-d964-4746-ae58-640d396f5aed.png">

### 5.Write a Java program to compare two hash set.
### CODE
```
import java.util.HashSet;
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
```
### OUTPUT
<img width="328" alt="image" src="https://user-images.githubusercontent.com/93427089/229344389-918608bc-63fa-43d5-a4eb-569a4c54d5b7.png">

### 6.Write a Java program to retrieve and remove the last element of a tree set.
### CODE
```
import java.util.TreeSet;
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
```
### OUTPUT
<img width="305" alt="image" src="https://user-images.githubusercontent.com/93427089/229344561-4868b628-8ee7-4538-8086-3212a9dc7cae.png">

### 7.Write a Java program to convert a Priority Queue elements to a string representation.
### CODE
```
import java.util.PriorityQueue;
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

```
### OUTPUT
<img width="359" alt="image" src="https://user-images.githubusercontent.com/93427089/229344635-a9fe624a-dc18-4223-b997-0cf22fcfd180.png">

### 8.Write a Java program to get a collection view of the values contained in this map.
### CODE
```
import java.util.HashMap;
public class Main9 {
        public static void main(String args[]){

            HashMap<Integer,String> arr= new HashMap<Integer,String>();
            arr.put(1,"A");
            arr.put(2,"B");
            arr.put(3,"C");
            arr.put(4,"D");
            arr.put(5,"E");
            System.out.println("Collection view: "+ arr.values());
        }
}
```
### OUTPUT
<img width="208" alt="image" src="https://user-images.githubusercontent.com/93427089/229344683-bb0da2dc-18c9-4eac-84fd-95d3628ff008.png">

### 9.Write a Java program to get a set view of the keys contained in this map
### CODE
```
import java.util.HashMap;
import java.util.Set;
public class Main10 {
    public static void main(String args[]){

        HashMap<Integer,String> arr= new HashMap<Integer,String>();
        arr.put(1,"A");
        arr.put(2,"B");
        arr.put(3,"C");
        arr.put(4,"D");
        arr.put(5,"E");
        Set x = arr.keySet();
        System.out.println("set view of the keys contained in this map: "+x);

    }
}
```
### OUTPUT
<img width="371" alt="image" src="https://user-images.githubusercontent.com/93427089/229344881-a3e674cf-df3a-4e25-a01d-11664bae3310.png">

### 10.Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
### CODE
```
import java.util.*;
public class Main11 {
    public static void main(String args[]) {
        TreeMap < Integer, String > arr = new TreeMap < Integer, String > ();
        arr.put(1,"A");
        arr.put(2,"B");
        arr.put(3,"C");
        arr.put(4,"D");
        arr.put(5,"E");
        System.out.println("Original: " + arr);
        System.out.println("Keys greater than or equal to 1: " + arr.ceilingEntry(1));
        System.out.println("Keys greater than or equal to 3: " + arr.ceilingEntry(3));
        System.out.println("Keys greater than or equal to 6: " + arr.ceilingEntry(6));
    }
}
```
### OUTPUT
<img width="236" alt="image" src="https://user-images.githubusercontent.com/93427089/229344945-8e8ecfe0-1c72-4551-b573-47d82d9ac557.png">

### 11.Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
### CODE
```
import java.util.*;
public class Main12 {
    public static void main(String args[]) {
        TreeMap < Integer, String > arr = new TreeMap < Integer, String > ();
        arr.put(1,"A");
        arr.put(2,"B");
        arr.put(3,"C");
        arr.put(4,"D");
        arr.put(5,"E");
        System.out.println("Original: " + arr);
        System.out.println("Keys greater than or equal to 1: " + arr.ceilingKey(1));
        System.out.println("Keys greater than or equal to 3: " + arr.ceilingKey(3));
        System.out.println("Keys greater than or equal to 6: " + arr.ceilingKey(6));
    }
}
```
### OUTPUT
<img width="236" alt="image" src="https://user-images.githubusercontent.com/93427089/229344968-4e2c81e8-a3da-4893-9876-82957732a603.png">
