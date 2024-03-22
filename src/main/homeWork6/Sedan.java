package main.homeWork6;

public class Sedan extends Car{
    public Sedan(String model, String color){
        this.model = model;
        this.color = color;
    }

    @Override
    public void refuel() {
        super.refuel();
        System.out.println("бензином");
    }
}
