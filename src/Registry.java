// design patern REGISTRY

import java.util.HashMap;
import java.util.Map;

public class Registry {
  public static enum Types{
	  black, white, ginger
  }
     private static Map<Types,Pisica> map= new HashMap<>();
     
     public static Pisica getInstance(Types t){
    	 if( !map.containsKey(t) ) {
    		 map.put(t, new Pisica());
    	 }
    	 return map.get(t);
     }
}
