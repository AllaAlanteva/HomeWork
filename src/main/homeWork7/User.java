package main.homeWork7;

import java.util.*;

public class User {
    private int id;
    private String name;
    private int age;
    private Sex sex;
    private static Map<Integer, User> allUsers = new HashMap<>();
    private static int countId = 0;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                sex == user.sex;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, sex);
    }

    public User(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

        if (!hasUser()) {
            countId++;
            this.id = countId;
            allUsers.put(id, this);
        }
    }

    private boolean hasUser(){
        for (User user : allUsers.values()){
            if (user.equals(this) && user.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    //    Формировать список всех пользователей.
    public static List<User> getAllUsers(){
        return new ArrayList<>(allUsers.values());
    }

    //    Формировать список пользователей по полу(MALE/FEMALE).
    public static List<User> getAllUsers(Sex sex){
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers.values()){
            if (user.sex == sex){
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }

    //    Возвращать количество пользователей в общем списке, и посчитать количество по признаку пола пользователя.
    public static int getHowManyUsers(){

        return allUsers.size();
    }

    public static int getHowManyUsers(Sex sex){

        return getAllUsers(sex).size();
    }

    //    Посчитать общую сумму по возрасту пользователей, так же учесть по признаку пола.
    public static int getAllAgeUsers(){
        int countAge = 0;
        for (User user : allUsers.values()){
            countAge += user.age;
        }
        return countAge;
    }

    public static int getAllAgeUsers(Sex sex){
        int countAge = 0;
        for (User user : getAllUsers(sex)){
            countAge += user.age;
        }
        return countAge;
    }

    //    Посчитать средний возраст, как общий так и по признаку пола.
    public static int getAverageAgeOfAllUsers(){

        return getAllAgeUsers() / getHowManyUsers();
    }

    public static int getAverageAgeOfAllUsers(Sex sex){

        return getAllAgeUsers(sex) / getHowManyUsers(sex);
    }
}
