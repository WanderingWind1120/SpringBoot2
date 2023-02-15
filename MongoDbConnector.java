package SB6;

public class MongoDbConnector extends DatabaseConnector{
    public void connect (){
        System.out.println("Đã kết nối tới MongoDb:" + getUrl());
    }
}
