package com.ca.mahima.collections;

public class Person implements Cloneable{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int hashCode() {
        return 420;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
