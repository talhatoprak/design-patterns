package com.talhatoprak.dp.structural.decorator.phone;

public class PhoneTest {
    public static void main(String[] args) {
        IPhoneProMax iPhoneProMax=new IPhoneProMax(new IPhone());

        System.out.println(" Name : " + iPhoneProMax.getName());
        System.out.println(" Price : " + iPhoneProMax.getPrice());
        System.out.println(" Camera count : " + iPhoneProMax.getCameraCount());
    }
}
