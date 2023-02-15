package SB6;

public class MySQLConnector extends DatabaseConnector{
    public void connect(){
        System.out.println("Đã kết nối tới MySQL: "+ getUrl());
    }
}
