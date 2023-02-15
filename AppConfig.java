package SB6;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    SimpleBean simpleBeanConfigure(){
        return new SimpleBean("loda");
    }

    @Bean("mysqlConnector")
    DatabaseConnector mysqlConfigure(){
        DatabaseConnector mySQLConnector = new MySQLConnector();
        mySQLConnector.setUrl("jdbc:mysql://host1:33060/loda");
        // set username, password, format
        return mySQLConnector;
    }

    @Bean("mondodbConnector")
    DatabaseConnector mongodbConfigure(){
        DatabaseConnector mongoDbConnector = new MongoDbConnector();
        mongoDbConnector.setUrl("mongodb://mongodb0.example.com:27017l/loda");
        // set username, password, format, v.v ...
        return mongoDbConnector;
    }

    @Bean("postgresqlConnector")
    DatabaseConnector postgresqlConfigure() {
        DatabaseConnector postgreSqlConnector = new PostgreSqlConnector();
        postgreSqlConnector.setUrl("postgresql://localhost//loda");
        // set username, password, format, v.v. ...
        return postgreSqlConnector;
    }
}
