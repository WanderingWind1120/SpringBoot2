package SB6;

import org.hibernate.dialect.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
    @Bean
    SimpleBean  simpleBeanConfigure (){
        return new SimpleBean("loda");
    }

    @Bean ("mysqlConnector")
    DatabaseConnector mysqlConfigure(SimpleBean simpleBean){
        DatabaseConnector mySqlConnector = new MySQLConnector();
        mySqlConnector.setUrl("jdbc:sql://host1:33060/" + simpleBean.getUserName());
        return mySqlConnector;
    }
}
