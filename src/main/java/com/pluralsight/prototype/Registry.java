package com.pluralsight.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;

        try {
            item = (Item) (items.get(type)).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Basic movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        movie.setUrl("http://imdb.com");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(244);
        book.setTitle("da vinci code");
        book.setPrice(30.53);
        items.put("Book", book);
    }
}
