package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {
    public static void main(String args[]){
        DbSingleton finstance = DbSingleton.getInstance();
        System.out.println(finstance);

        DbSingleton sinstance = DbSingleton.getInstance();
        System.out.println(sinstance);

        Connection connection = finstance.getConnection();

        Statement sqlStatement;

        try {
            sqlStatement = connection.createStatement();
            int count = sqlStatement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table created.");
            sqlStatement.close(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
