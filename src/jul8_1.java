
public class jul8_1 {

public enum Seasons {
  PRIMAVARA, VARA, TOAMNA, IARNA
}
	
  public static void main(String []args) {
	  Seasons s= Seasons.VARA;
	  String s1="altceva";
	  switch(s) {
	  case PRIMAVARA: { System.out.println("April showers");
	  break; }
	  case VARA: {System.out.println("e cald ca dracu");
	  break; }
	  case TOAMNA: {System.out.println("tot cald ca dracu pt ca israel");
	  break; }
	  case IARNA: {System.out.println("ploua ca dracu");
	  break; }
	  default: System.out.println("ai gresit sezonul baiatul meu");
	  }
  }
}
