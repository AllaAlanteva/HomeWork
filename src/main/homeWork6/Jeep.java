package main.homeWork6;

public class Jeep extends Car{
    public Jeep(String model, String color){
        this.model = model;
        this.color = color;
    }

    @Override
    public void refuel() {
        super.refuel();
        System.out.println("дизелем");
    }
}
