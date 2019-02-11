public class EquipmentTest
{

    /**
     * Test the Equipment constructor and the getters
     */
    public void equipmentConstructorTest() throws AssertException
    {
        // Use the default constructor
    	String equipTest = "noname/0,10.0,10.0,test of equipment constructor";
        Equipment equipment = new Equipment(equipTest);

        // The name should be "noname", color "unknown", height and weight 0.
        
        Assert.assertEquals("name", equipment.getName());
        Assert.assertEquals("count", equipment.getCount());
        Assert.assertEquals()
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

}

