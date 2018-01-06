package com.pluralsight.builder;

public class LunchOrderBeanDemo {
    public static void main(String args[]){
        LunchOrderBean lunchOrderBean = LunchOrderBean
                .builder()
                  .bread("Hi")
                  .condiments("bye")
                  .dressing("get")
                  .meat("set")
                .build();

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
}
