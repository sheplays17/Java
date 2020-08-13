package task3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	  List<Animal>animals;
	  
	  public Zoo() {
		  animals= new ArrayList<>();
	  }
	  
	  public void addAnimal(Animal a) {
		  animals.add(a);
	  }
	  public void removeAnimal(Animal a) {
		  animals.remove(a);
	  }
	  public boolean areAnimals() {
		  if(animals.size() ==0) {
			  return true;
		  }
		  return false;
	  }
	  public List<Animal> getAnimals(){
		  return animals;
	  }
	  public int size() {
		  return animals.size();
	  }
}
