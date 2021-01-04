package com.livestudy.eighth;

public class PhoneApp {
    public static void main(String[] args) {
        //래퍼런스로 사용하는 방법
        Phone phone = new Galaxy();
        phone.setSerialNumber(100);


        //인스턴스로 사용하는 방법
        Galaxy galaxy = new Galaxy();
        galaxy.setSerialNumber(200);

        int serialNumber = galaxy.getSerialNumber();
        System.out.println(serialNumber);

        int serialNumber1 = ((Galaxy) phone).getSerialNumber();
        System.out.println(serialNumber1);

    }
}
