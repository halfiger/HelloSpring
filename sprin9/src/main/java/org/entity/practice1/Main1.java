package org.entity.practice1;

// 👉 main НЕ повинен містити Hibernate-логіку
public class Main1 {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Ira", "ira@mail", 39);
        userService.saveUser(user);
        System.out.println("attempt to save");
    }
}