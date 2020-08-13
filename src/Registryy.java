import java.util.*;

public class Registryy {
   public static enum Type{
	   smart, dumb, meh
   }
   private static Map<Type,Student> registry=  new HashMap<>();
   
   public static Student getInstance(Type type) {
	   if ( !registry.containsKey(type)) {
		   registry.put(type, new Student());
	   }
	   return registry.get(type);
   }
}
