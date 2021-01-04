package com.livestudy.eighth;

public class IPhone implements Phone, Camera{
    private int serialNumber;
    //Camera Method
    @Override
    public void shootPhoto(int time) {
        System.out.println("Shooting Photo for "+time+" second" );
    }

    @Override
    public void shootVideo(int time) {
        System.out.println("Shooting Video for "+time+" second" );
    }

    //Phone Method
    @Override
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
