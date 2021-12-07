package io.zipcoder.interfaces;

public class Person {

    public final Long id;
    public String name;

    public Person(Long id, String name) {
        this.name = name;
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
