package SB6;

public class SimpleBean {
    private String userName;
    public SimpleBean(String userName){
        setUserName(userName);
    }
    public void setUserName (String userName){
        this.userName = userName;
    }
    @Override
    public String toString (){
        return "This is a simple bean, name: " + userName;
    }
    public String getUserName (){
        return userName;
    }
}
