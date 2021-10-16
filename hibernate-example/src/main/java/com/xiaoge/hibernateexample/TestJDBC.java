package com.xiaoge.hibernateexample;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {
        String jdbcurl = "jdbc:mysql://localhost:3306/lilaunt?useSSL=false&serverTimezone=UTC";
        String user = "lilaunt";
        String pwd = "lilaunt";
        try{

            System.out.println("connecting to DataBase");
            Connection myC = DriverManager.getConnection(jdbcurl,user,pwd);
            System.out.println("Connection Successful");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
