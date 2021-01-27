package com.livestudy.eleventh;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("user A",Grade.DIAMOND);
        User user2 = new User("user B",Grade.VIP);

        int discount = getDiscount(user);
        System.out.println(user.getId()+"의 등급은 "+user.getGrade()+"이고, 할인 가격은 "+discount+"원 입니다.");
    }

    private static int getDiscount(User user) {
        if(user.getGrade() == Grade.VIP)
            return 3000;
        if (user.getGrade() == Grade.DIAMOND)
            return 2000;
        if (user.getGrade() == Grade.GOLD)
            return 1000;
        return 0;
    }
}
