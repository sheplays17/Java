import java.util.HashMap;
import java.util.Map;

public class Rregistry {
   public static enum Type{
	   mic, mediu,mare
   }
   private static Map<Type,Pisica> map= new HashMap<>();
   
   public static Pisica getInstance(Type t) {
	   if( !map.containsKey(t)) {
		   map.put(t, new Pisica());
	   }
	   return map.get(t);
   }
}
