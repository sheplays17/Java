import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class feb3 {
  public static void main(String[]args) {
	  
	  /*
	  List<Integer> lista=  Arrays.asList(1,2,3,4,5);
	  lista.stream()
	       .filter(x->x%2==1)
	       .forEach(System.out::println);*/
	  
	  TreeSet<Pisica> set= new TreeSet<Pisica>();
	  Pisica p1= new Pisica("Tom",2);	 
	  set.add(p1);
	  set.add(new Pisica("Mitzi",3));
	  set.add(new Pisica("Pufi",1));
	  set.add(new Pisica("Fifi",7));
	  System.out.println(set);
	  
	  
	  Map<Integer, String>map= new HashMap<>();
	  map.put(1, "ana");
	  map.put(19, "ene");
	  map.put(7, "lela");
	  map.put(43, "misi");
	  map.put(1, "clara");
	  
	  Set<Integer> keys= map.keySet();
	  for (Integer k: keys) {
		  System.out.println(k+" "+map.get(k));
	  }
	  System.out.println();
	  map.forEach((k,x)->System.out.println(k+" "+x));
	  
	 /* Random r=new Random();
	  int a=r.nextInt(10);
	  int b=r.nextInt(100);
	  boolean c= r.nextBoolean();
	  double d=r.nextDouble();
	  float f= r.nextFloat();
	  System.out.println(a+" "+b+" "+c+" "+d+" "+f);
	  */
	  /*
	  Scanner s= new Scanner(System.in);
	  System.out.println("Introdu numele tau:");
	  String nume= s.nextLine();
	  System.out.println("Hello "+nume);
	  */
	  
	  /*
	  Random r= new Random();
	  Scanner s= new Scanner(System.in);
	  int contor=0;
	  do {
		  System.out.println("Dati un numar:");	  
	  	  String line= s.nextLine();	  
		  try {
			  int numar= Integer.parseInt(line);
			  for (int i=0;i<numar;i++) {
				  System.out.print(r.nextInt(10)+" ");
			  }
			  contor=1;
		  }catch(NumberFormatException e){
			  System.out.println("Valoarea introdusa nu este un numar intreg");
		  }
	  }while(contor==0);
	  */
  }
}
