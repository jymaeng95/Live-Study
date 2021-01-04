package com.livestudy.eighth;

public class Galaxy implements Phone{
    private int serialNumber;

    @Override
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void printYear() {
        System.out.println(YEAR);
//        YEAR = 10;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
