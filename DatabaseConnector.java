package SB7;

public abstract class DatabaseConnector {
    private String url;
    /*
    Hàm này có nhiệm vụ connect tới 1 Database bất kì
     */
    public abstract void connect();

    public String getUrl(){
        return url;
    }
    public void setUrl (String url){
        this.url = url;
    }
}
