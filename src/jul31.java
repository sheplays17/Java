
public class jul31 {
  public static void main(String[]args) {
	  
	  int a=6,b=4;
	  boolean c= a>b? true: false;
	  System.out.println(c);
	  Matza.z=10;
	  System.out.print(Matza.z);
// -----------------------------------------------------------
	  
	  int [] za= new int[5];
	  za[3]=9;
	 /* for(int i:za) {
		  System.out.print(i+" "+za[i]);
		  System.out.println();

	  }*/
	  
	  //in concluzie in enhanced for cursorul parcurge.. luand indexul numarul care se afla la referinta??
	  // gen x[2]=19  el cand ajunge la x[2] va incerca sa acceseze pozitia 19 din vector (care nu exista)
	  
	  System.out.println();
	  
	  

	  int[] zi= {0,2,9,6,13};

      Ioanaa i= new Ioanaa();
      i.setVarsta(25);
      i.setSexualitate("straight, bitch, what did u think?");
      System.out.println("varsta Ioana: "+i.getVarsta());
      System.out.print("sexualitate Ioana: "+i.getSexualitate());

      
	 

  }
}
