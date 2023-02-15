package SB7;

import SB7.MySQLConnector;
import org.hibernate.dialect.Database;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // Lấy giá trị config từ file application.properties
    @Value("${loda.mysql.url}")
    String mysqlUrl;

    @Bean
    DatabaseConnector mysqlConfigure(){
        DatabaseConnector mySqlConnector = new MySQLConnector();
        mySqlConnector.setUrl(mysqlUrl);
        System.out.println("Config MySql Url: " +mysqlUrl);
        return  mySqlConnector;
    }
}
