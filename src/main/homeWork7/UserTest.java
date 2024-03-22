package main.homeWork7;



import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserTest {
    private User user;
    private User user1;
    private User user2;
    List<User> expected = User.getAllUsers();

    //написать прекондицию с созданием тестовых данных пользователей
    @BeforeEach
    public void setUp() {
        user = new User("Мария", 25, Sex.FEMALE);
        user1 = new User("Иван", 30, Sex.MALE);
        user2 = new User("Петр", 20, Sex.MALE);
    }


    //сравнить через assertEquals список пользователей созданный в тесте, с тем, что был создан в прекондициях
    @Order(9)
    @RepeatedTest(2)
    @DisplayName("Сравнить списки пользователей")
    void getAllUsers() {
        List<User> actual = new ArrayList<>();
        actual.add(new User("Мария", 25, Sex.FEMALE));
        actual.add(new User("Иван", 30, Sex.MALE));
        actual.add(new User("Петр", 20, Sex.MALE));
        assertEquals(expected, actual);
    }

    //проверить, что список не пустой после beforeEach
    @Order(8)
    @RepeatedTest(2)
    @DisplayName("Список не пустой")
    void getAllUsers_NO_NULL() {
        List<User> expected = User.getAllUsers();
        assertNotNull(expected);
    }


    //проверить, что из списка можно запросить записи с фильром по полу(параметризованным способом)
    @Order(7)
    @ParameterizedTest(name = "Список c фильтром")
    @DisplayName("Список с фильтром по полу")
    @EnumSource(Sex.class)
    void getAllUsers_sex(Sex sex) {
        List<User> users = User.getAllUsers(sex);
        if (sex == Sex.FEMALE) {
            assertEquals(1, users.size());
        } else {
            assertEquals(2, users.size());
        }
    }


    //проверить корректность работы метода getHowManyUsers
    @Order(6)
    @RepeatedTest(2)
    @DisplayName("Кол-во людей в списке")
    void getHowManyUsers() {
        int expected = User.getHowManyUsers();
        int actual = 3;
        assertEquals(expected, actual);
    }

    //проверить корректность работы метода getHowManyUsers с фильром по полу(параметризованным способом)
    @Order(5)
    @ParameterizedTest(name = "Кол-во людей в списке с фильтром")
    @DisplayName("Кол-во людей в списке с фильтром")
    @EnumSource(Sex.class)
    void getHowManyUsers_sex(Sex sex) {
        int expected = User.getHowManyUsers(sex);
        int actual = 1;
        assertEquals(expected, actual);
    }


    //проверить корректность работы метода getAllAgeUsers
    @Order(4)
    @RepeatedTest(2)
    @DisplayName("Общий возраст")
    void getAllAgeUsers() {
        int expected = User.getAllAgeUsers();
        int actual = 25 + 30 + 20;
        assertEquals(expected, actual);
    }

    //проверить корректность работы метода getAllAgeUsers с фильром по полу(параметризованным способом)
    @Order(3)
    @ParameterizedTest(name = "Общий возраст в списке с фильтром")
    @DisplayName("Общий возраст в списке с фильтром")
    @EnumSource(Sex.class)
    void getAllAgeUsers_sex(Sex sex) {
        int expected = User.getAllAgeUsers(sex);
        int actual = 25;
        assertEquals(expected, actual);
    }

    @Order(2)
    @RepeatedTest(2)
    @DisplayName("Средний возраст")
    void getAverageAgeOfAllUsers() {
        int expected = User.getAverageAgeOfAllUsers();
        int actual = (25 + 30 + 20) / 3;
        assertEquals(expected, actual);
    }

    @Order(1)
    @RepeatedTest(2)
    @DisplayName("Средний возраст с фильтром")
    void getAverageAgeOfAllUsers_sex() {
        int expected = User.getAverageAgeOfAllUsers(Sex.MALE);
        int actual = (30 + 20) / 2;
        assertEquals(expected, actual);
    }
}
