package main.homeWork6;

public class main {
    public static void main(String[] args) {

        Printer<Jeep> jeep = new Printer<>(new Jeep("Land Cruiser","Черный"));
        jeep.print();
        jeep.refuel();

        Printer<Sedan> sedan = new Printer<>(new Sedan("Focus","Белый"));
        sedan.print();
        sedan.refuel();

        display("FORD", "Focus");
        display("Год выпуска",2017);
        display("Двигатель", 1.6);
    }
    public static <T, V> void display(T info, V data){
        System.out.print(info + " ");
        System.out.println(data + ":)");
    }
}
