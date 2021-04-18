package com.yuriy;

public class Main {

    public static void main(String[] args) {
        User user = new Instructor(10);
        Utils.printUser(user);
        GenericList<Instructor> users = new GenericList<>();
        Utils.printUsers(users);
    }
}
