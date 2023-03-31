package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Билет 13. Задача.
        //Дан класс User, который содержит поля с именем и возрастом.
        // Необходимо реализовать следующий метод:

        //Задание №1 На входе коллекция пользователей
        User user1 = new User("Ivan", 10);
        User user2 = new User("Ivan", 10);
        User user3 = new User("Petr", 35);
        User user4 = new User("Petr", 35);
        User user5 = new User("Roma", 25);
        User user6 = new User("Oleg", 20);
        User user7 = new User("Roma", 35);
        List<User> userList = Arrays.asList(user1, user2, user3, user4, user5, user6, user7);
        System.out.println("Коллекция пользователей:");
        System.out.println(userList);

        //Задание №2 Необходимо удалить все дубли (одинаковое имя и возраст)
        List<User> userList1 = new ArrayList<>();
        for (User user : userList) {
            if (!userList1.contains(user)) {
                userList1.add(user);
            }
        }
        System.out.println("Коллекция пользователей с удалёнными дублями:");
        System.out.println(userList1);

        //Задание №3 Отсортировать по возрасту и имени
        userList1.sort(Comparator.comparing(o -> o.age));
        System.out.println("Коллекция пользователей отсортированная по возрасту:");
        for (User user : userList1) {
            System.out.println(user);
        }
        System.out.println(userList1);

        userList1.sort(Comparator.comparing(o -> o.name));
        System.out.println("Коллекция пользователей отсортированная по имени:");
        for (User user : userList1) {
            System.out.println(user);
        }
        System.out.println(userList1);


        //Задание №4 Вернуть самого старого пользователя
        List<User> oldest1 = new ArrayList<>();
        User oldest = null;
        for (User user : userList1) {
            if (oldest == null || user.getAge() > oldest.getAge()) {
                oldest = user;
                oldest1.clear();
                oldest1.add(user);
            } else if (user.getAge() == oldest.getAge()) {
                oldest1.add(user);
            }
        }
        System.out.println("Самый старый пользователь:");
        System.out.println(oldest1);
    }
}
