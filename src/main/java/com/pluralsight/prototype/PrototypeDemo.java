package com.pluralsight.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String args[]){
        String sql ="demo sql";
        List<String> parameters = new ArrayList<String>();
        parameters.add("dummy");
        Record record = new Record();
        Statement statement = new Statement(sql, parameters, record);

        System.out.println(statement.getSql());
        System.out.println(statement.getParameters());
        System.out.println(statement.getRecord());

        Statement statement1 = statement.clone();

        System.out.println(statement1.getSql());
        System.out.println(statement1.getParameters());
        System.out.println(statement1.getRecord());
    }
}
