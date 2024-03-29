/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void fullConstructorTest() throws AssertException
    {
    	Animal animalTwo = new Animal("Orange", "Tony", 200.1, 20.1);
    	String expectedToString = "Tony, a Orange-colored animal. 200.1 pounds, 20.1 inches\n";
    	
    	Assert.assertEquals(200.1, animalTwo.getWeight(), 0.01);
    	Assert.assertEquals(20.1, animalTwo.getHeight(), 0.01);
    	Assert.assertTrue(animalTwo.getName().equals("Tony"));
    	Assert.assertTrue(animalTwo.getColor().equals("Orange"));
    	Assert.assertEquals(expectedToString, animalTwo.toString());
    	
    }
}

