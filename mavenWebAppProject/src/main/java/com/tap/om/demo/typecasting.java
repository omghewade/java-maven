package com.tap.om.demo;

import java.util.*;

public class typecasting {

    public static void main(String[] args) {

        int a = (int) 4.5;
        System.out.println(a);
        System.out.println("enter the number ");
        Scanner sc = new Scanner(System.in);
        int na = sc.nextInt();
        boolean b = sc.nextBoolean();
        System.out.println("the value of na is" + na);
        System.out.println(b);
    }

}