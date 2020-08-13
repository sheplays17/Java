import java.util.*;

public class feb4 {
   public static void main(String[] args) {
      TreeSet<Doggo> tree= new TreeSet<>();
      tree.add(new Doggo("Tomitza",2));
      tree.add(new Doggo("Labush",5));
      tree.add(new Doggo("Snoop",3));
      tree.add(new Doggo("Bitch",1));

      System.out.print(tree);
      
      
      
      Map<Integer,String> map= new HashMap<>();
      map.put(11, "mimi");
      map.put(1, "moma");
      map.put(8, "lala");
      map.put(2, "lili");
      
      
      Set<Integer> keys= map.keySet();
      for(Integer k:keys) {
    	  System.out.println(k+" "+map.get(k));
      }
      map.forEach((k,x)->System.out.println(k+" "+x));
      
      List<Integer> lista= Arrays.asList(1,4,7,2,9,2);
      lista.forEach(System.out::println);
   }
}
