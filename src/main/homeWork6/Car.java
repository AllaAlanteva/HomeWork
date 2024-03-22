package main.homeWork6;

public class Car implements ICar{
    protected String model;
    protected String color;


    public void print(){
        System.out.println(model);
        System.out.println(color);
    }

    public void refuel() {
        System.out.print("Я заправляюсь ");
    }
}
