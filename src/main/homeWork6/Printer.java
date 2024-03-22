package main.homeWork6;

public class Printer<T extends Car & ICar> {
    T toPrint;

    public Printer(T toPrint) {
        this.toPrint = toPrint;
    }

    public void print() {
        toPrint.print();
    }

    public void refuel() {
        toPrint.refuel();
    }
}
