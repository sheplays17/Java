package Ioana;

import java.util.*;

public class ProdusRegistry {
	  public static enum Type{
		  SWEET, SOUR, BITTER
	  }
	  private static Map <Type,Produs> registry = new HashMap<>();
	  
	  public static Produs getInstance(Type t) {
		  
		  if(!registry.containsKey(t)) {
			  registry.put(t,new Produs());
		  }
		  return registry.get(t);
	  }
}
