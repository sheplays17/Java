
public class Bunny {
  int ani;
  String mood;
  
  private static Bunny BANIETTE = null;
  
  private Bunny() {}
  
  public static Bunny getInstance() {
	  if (BANIETTE == null) {
		  BANIETTE= new Bunny();
	  }
	  return BANIETTE;
  }
}
