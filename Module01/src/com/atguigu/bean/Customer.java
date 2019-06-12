package com.atguigu.bean;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Auther: libo
 * @Date: 2019-06-11
 * @Description: com.atguigu.bean
 * @version: 1.0
 */
public class Customer {
    private int age;
    private String name;
    private double xx;
    private String address;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getXx() {
        return xx;
    }

    public void setXx(double xx) {
        this.xx = xx;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setAddress("上海");
        customer.age=123;
        System.out.println(customer.getAddress());
        System.out.println("123dsdf");
        String a = "第三方";
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        ArrayList list = new ArrayList();
        customer.getAddress();
        System.out.println("args = [" + args + "]");
        System.out.println("Customer.main");
        System.out.println("list = " + list);

    }


    public void aa() {

    }
}

