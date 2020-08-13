package task3;

import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class Testt {
  Zoo zoo;
  
  @Before
  public void setup() {
	  zoo= new Zoo();
  }
  
  @org.junit.Test
  public void testAddAnimal() {
	  Animal a= new Animal();
	  int init_size=zoo.size();
	  zoo.addAnimal(a);
	  int after_size= zoo.size();
	  Assert.assertEquals(true, init_size+1==after_size);
  }
  @org.junit.Test 
  public void testAreAnimalsInZoo() {
	 zoo.areAnimals();
	 Assert.fail();
  }

  
  @After
  public void tearDown() {
	  zoo=null;
  }
}
