package com.java.java8.predicate;

public class Apple
{
    
    private Integer weight;
    private String color;
    public Integer getWeight()
    {
        return weight;
    }
    public void setWeight(Integer weight)
    {
        this.weight = weight;
    }
    
    @Override
    public String toString()
    {
        return "Apple [weight=" + weight + ", color=" + color + "]";
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public Apple(Integer weight, String color)
    {
        super();
        this.weight = weight;
        this.color = color;
    }

}
