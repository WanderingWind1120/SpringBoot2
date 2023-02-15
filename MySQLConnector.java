package SB7;

import SB7.DatabaseConnector;

public class MySQLConnector extends DatabaseConnector {
    public void connect(){
        System.out.println("Đã kết nối tới MySQL: "+ getUrl());
    }
}
