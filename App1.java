package SB6;

import org.hibernate.dialect.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App1 {
    public static void main (String[] args){
        ApplicationContext context = SpringApplication.run(App1.class, args);
        DatabaseConnector mySql = (DatabaseConnector) context.getBean("mysqlConnector");
        mySql.connect();

        DatabaseConnector mongodb = (DatabaseConnector) context.getBean("mongodbConnector");
        mongodb.connect();

        DatabaseConnector postgresql = (DatabaseConnector) context.getBean("postgresqlConnector");
        postgresql.connect();
    }
}
