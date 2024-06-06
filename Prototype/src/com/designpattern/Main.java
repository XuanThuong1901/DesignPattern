package com.designpattern;

import com.designpattern.Entity.User;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User user1 = new User("nxthuong", "Nguyễn Xuân Thường", "123456");

        User user2 = user1.clone();

        User user3 = user1.Clone();

        System.out.println("----------------");
        System.out.println(user1);
        System.out.println("----------------");
        System.out.println(user2);
        System.out.println("----------------");
        System.out.println(user3);

    }
}
