package com.company;


public class OnlineProducts {

    // main method
    public static void main(String[] args) {

        LedTv ledTv = new LedTv();
        MobilePhone mobilePhone = new MobilePhone();

        ledTv.setProductDetails("XYZ",120000.50,003);
        ledTv.setProductDetails("brand1","techology1");

        mobilePhone.setProductDetails("ABC",28000.70,003);
        mobilePhone.setProductDetails(8.0,"windows",4.5);

        ledTv.printProductDetails();
        mobilePhone.printProductDetails();
    }
}

