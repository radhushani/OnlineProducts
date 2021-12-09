package com.company;

 abstract public class Product {
     private int pId;
     private String name;
     private double price;

     public void setName(String name) {
         this.name = name;
     }

     public void setPId(int pId) {
         this.pId = pId;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     public String getName() {
         return name;
     }

     public double getPrice() {
         return price;
     }

     public int getPId() {
         return pId;
     }

     abstract void setProductDetails(String name, double price, int pId);

     abstract void printProductDetails();
 }
