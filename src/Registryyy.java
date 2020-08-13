import java.util.*;

public class Registryyy {
   public static enum Type{
	   pui, mediu, mare
   }
   private static Map<Type,Pisica> map=  new HashMap<>();
   
   public static Pisica getInstance(Type t) {
	   if( !map.containsKey(t)) {
		   map.put(t, new Pisica());
	   }
	   return map.get(t);
   }
}
