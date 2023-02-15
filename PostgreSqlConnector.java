package SB6;

public class PostgreSqlConnector extends DatabaseConnector{
    public void connect(){
        System.out.println("Đã kết nối tới Postgresql: " + getUrl());
    }

}
