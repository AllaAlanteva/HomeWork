package main.homeWork5;

public class Animal {

    protected String name;
    protected int age;
    protected int weight;
    protected String color;

    @Override
    public String toString() {
        String years = "лет";
        if (age % 10 == 1 && age != 11) {
            years = "год";
        } else if ((age % 10 >= 2 && age % 10 <= 4) && (age < 10 || age > 20)) {
            years = "года";
        }
        return "Привет! Меня зовут " + name + ", мне " + age + " " + years + ", я вешу - " + weight + " кг, мой цвет - " + color;
    }
    private String activity;

    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    public void say() {
        System.out.println("Я говорю");
    }
    public void go() {
        System.out.println("Я иду");
    }
    public void drink() {
        System.out.println("Я пью");
    }
    public void eat() {
        System.out.println("Я ем");
    }
}
