public class EquipmentTest
{

    /**
     * Test the Equipment constructor and the getters
     */
    public void equipmentConstructorTest() throws AssertException
    {
        // Use the default constructor
    	String equipTest = "noname/0,10.0,10.0,description";
        Equipment equipment = new Equipment(equipTest);

        // The name should be "noname", color "unknown", height and weight 0.
    	
    	Assert.assertTrue(equipment.getName().equals("noname"));
    	Assert.assertTrue(equipment.getDescription().equals("description"));
    	Assert.assertEquals(0, equipment.getCount());
    	Assert.assertEquals(10.0, equipment.getTotalWeight());
    	Assert.assertEquals(10.0, equipment.getTotalPrice());
    	
    	String expectedToString = "Name: noname, Number: 0, Weight: 10.00 lbs, Price: $10.00 - description";
    	Assert.assertEquals(expectedToString, equipment.toString());
    }

}

