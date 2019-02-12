public class ZooTest
{

    /**
     * Test the Equipment constructor and the getters
     */
    public void equipmentConstructorTest() throws AssertException
    {
        // Use the default constructor
    	int cap = 10;
    	String color = "Green";
    	
        Zoo zoo = new Zoo(cap);
        Animal animalOne = new Animal("Orange", "Tony", 30.0, 20.0);
    	Animal animalTwo = new Animal("Green", "Johnathan", 20.0, 10.0);
    	Animal animalThree = new Animal("Green", "Anne", 10.0, 10.0);
    	zoo.addAnimal(animalOne);
    	zoo.addAnimal(animalTwo);
    	zoo.addAnimal(animalThree);
    	
    	String expectedToString = "These animals live in the zoo: \n"
    			+ "Tony, a orange-colored animal. 30.00 pounds, 20.00 inches\n"
    			+ "Johnathan, a green-colored animal. 20.00 pounds, 10.00 inches\n"
    			+ "Anne, a gree-colored anumal. 10.00 pounds, 10.00 inches\n";
    			
    	Assert.assertEquals(20.0, zoo.getAverageWeight(), 0.01);
    	Assert.assertEquals(15.0, zoo.getAverageWeight(color), 0.01);
    	Assert.assertEquals(40.0, zoo.getTotalHeight(), 0.01);
    	Assert.assertEquals(10, zoo.getCapacity());
    	Assert.assertEquals(expectedToString, zoo.toString());
  
    }

}