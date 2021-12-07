package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void ImplementationTest(){
        Long id = 1L;
        String name = "Mike";
        Student test = new Student(id,name);

        Assert.assertTrue(test instanceof Learner);
    }

    @Test
    public void InheritanceTest(){
        Long id = 1L;
        String name = "Mike";
        Student test = new Student(id,name);

        Assert.assertTrue(test instanceof Person);
    }

    @Test
    public void LearnTest(){
        Long id = 1L;
        String name = "Mike";
        double hours = 11;
        Student test = new Student(id,name);

        test.learn(8);
        test.learn(3);

        int equal = Double.compare(test.getTotalStudyTime(),hours);
        Assert.assertEquals(equal,0);
    }
}
