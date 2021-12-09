package com.company;

public class LedTv extends Product{
    private String brand;
    private String technology;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getBrand() {
        return brand;
    }

    public String getTechnology() {
        return technology;
    }

    @Override
    void setProductDetails(String name, double price, int pId) {
        setName(name);
        setPId(pId);
        setPrice(price);
        setBrand(getBrand());
        setTechnology(getBrand());
    }

    void setProductDetails(String brand, String technology){
        this.brand=brand;
        this.technology=technology;
    }

    @Override
    void printProductDetails() {
        System.out.println("product details");
        System.out.println("name:" + getName());
        System.out.println("PId:" + getPId());
        System.out.println("Price:"+getPrice());
        System.out.println("brand:"+getBrand());
        System.out.println("technology:"+getTechnology());
    }
}
