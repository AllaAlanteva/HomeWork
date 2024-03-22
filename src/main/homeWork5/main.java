package main.homeWork5;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.say();
        animal.go();
        animal.drink();
        animal.eat();

        animal.name = "Тимоха";
        animal.age = 7;
        animal.weight = 8;
        animal.color = "рыжий";

        System.out.println(animal.toString());

        Cat cat = new Cat();
        cat.name = "Барсик";
        cat.age = 1;
        cat.weight = 10;
        cat.color = "черный";
        System.out.println(cat.toString());
        cat.say();

        Dog dog = new Dog();
        dog.name = "Бобик";
        dog.age = 4;
        dog.weight = 7;
        dog.color = "белый";
        System.out.println(dog.toString());
        dog.say();

        Duck duck = new Duck();
        duck.name = "Утя";
        duck.age = 5;
        duck.weight = 10;
        duck.color = "белый";
        System.out.println(duck.toString());
        duck.say();
        duck.fly();
    }
}
