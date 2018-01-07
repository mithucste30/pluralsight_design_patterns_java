package com.pluralsight.factory;

public class Shop extends Website {
    public void createPages() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
