public class ZooTest
{

    /**
     * Test the Equipment constructor and the getters
     */
    public void equipmentConstructorTest() throws AssertException
    {
        // Use the default constructor
    	int cap = 10;
    	
        Zoo zoo = new Zoo(cap);
        Animal animalOne = new Animal("Orange", "Tony", 30.0, 20.0);
    	Animal animalTwo = new Animal("Green", "Johnathan", 20.0, 10.0);
    	Animal animalThree = new Animal("Green", "Anne", 10.0, 10.0);
    	zoo.addAnimal(animalOne);
    	zoo.addAnimal(animalTwo);
    	zoo.addAnimal(animalThree);
    	
    	String expectedToString = "These animals live in the zoo: \n"
    			+ "Tony, a Orange-colored animal. 30.0 pounds, 20.0 inches\n"
    			+ "Johnathan, a Green-colored animal. 20.0 pounds, 10.0 inches\n"
    			+ "Anne, a Green-colored animal. 10.0 pounds, 10.0 inches\n";
    			
    	Assert.assertEquals(40.0, zoo.getTotalHeight(), 0.01);
    	Assert.assertEquals(10, zoo.getCapacity());
    	Assert.assertEquals(expectedToString, zoo.toString());
  
    }

}