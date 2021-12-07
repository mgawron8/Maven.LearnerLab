package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void ConstructorTest(){
        Long expectedId = 1L;
        String expectedName = "Mike";

        Person test = new Person(expectedId,expectedName);

        Assert.assertEquals(expectedId, test.getId());
        Assert.assertEquals(expectedName,test.getName());
    }

    @Test
    public void setNameTest(){
        Long expectedId = 1L;
        String oldName = "Mike";
        String newName = "notMike";

        Person test = new Person(expectedId,oldName);
        test.setName(newName);

        Assert.assertNotEquals(oldName,test.getName());
        Assert.assertEquals(newName,test.getName());
    }

}
