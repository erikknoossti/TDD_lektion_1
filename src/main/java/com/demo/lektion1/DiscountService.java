package com.demo.lektion1;

public class DiscountService {

    public double sum;
    public double discount;

    public double applyDiscount(){

        System.out.println(sum);
        System.out.println(discount);
        System.out.println(sum *(1 - discount/100));
        return sum * (1 - discount/100);

    }
}
