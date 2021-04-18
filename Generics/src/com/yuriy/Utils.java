package com.yuriy;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) > 0 ? first : second;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + " = " + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    public static void printUsers(GenericList<? extends User> users) {
        Object o = users.get(1);
        User user1 = users.get(1);
    }

    public static void addUsers(GenericList<? super User> users) {
        Object o = users.get(1);
        users.add(new User(10));
        users.add(new Instructor(10));
    }
}
