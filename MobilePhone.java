package com.company;

public class MobilePhone extends Product{
    private double ram;
    private String os;
    private double sdCard;

    public void setOs(String os) {
        this.os = os;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public void setSdCard(double sdCard) {
        this.sdCard = sdCard;
    }

    public double getRam() {
        return ram;
    }

    public double getSdCard() {
        return sdCard;
    }

    public String getOs() {
        return os;
    }

    @Override
    void setProductDetails(String name, double price, int pId) {
        setName(name);
        setPId(pId);
        setPrice(price);

    }

    void setProductDetails(double ram, String os,double sdCard){
        this.ram=ram;
        this.os=os;
        this.sdCard=sdCard;
    }

    @Override
    void printProductDetails() {
        System.out.println("product details");
        System.out.println("name:" + getName());
        System.out.println("PId:" + getPId());
        System.out.println("Price:"+getPrice());
        System.out.println("Ram:"+ getRam());
        System.out.println("OS:"+getOs());
        System.out.println("sdCard:"+getSdCard());
    }
}
