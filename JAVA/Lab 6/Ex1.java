import java.util.*;
 
public class hashsort {
 
  public static HashMap squar(int[] arr) {
    HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
 
    for (int i: arr) {
      a.put( i, i*i);
    }
    return a;
  }
 
  public static void main(String[] args) {
    int arr[] = new int[]{1,5,66,89,34};
    HashMap<Integer, Integer> b = squar(arr);
 
    Iterator<Integer> c = b.keySet().iterator();
    while(c.hasNext()){
    Integer key = c.next();
      System.out.println(key + " : " + b.get(key));
    }
  }
}
 