import java.util.HashMap;

//9.Write a Java program to get a collection view of the values contained in this map.
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


