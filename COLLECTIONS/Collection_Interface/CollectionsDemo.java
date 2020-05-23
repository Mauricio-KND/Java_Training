import java.util.*;
public class CollectionsDemo {
    public static void main(String[] args) {
        // Array List
        List a1 = new ArrayList();
        a1.add("Chavo");
        a1.add("Chompiras");
        a1.add("Chaparrón");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        // LinkedList
      List l1 = new LinkedList();
      l1.add("Chavo");
      l1.add("Chompiras");
      l1.add("Chaparrón");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);

      // HashSet
      Set s1 = new HashSet(); 
      s1.add("Chavo");
      s1.add("Chompiras");
      s1.add("Chaparrón");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      // HashMap
      Map m1 = new HashMap(); 
      m1.put("Chavo", "8");
      m1.put("Chompiras", "31");
      m1.put("Chaparrón", "31");
      m1.put("Chimontrufia", "30");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
    }
}
