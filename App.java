package SB6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class App {
    public static void main (String[] args){
        ApplicationContext context = SpringApplication.run(App.class, args);
        try{
            SimpleBean simpleBean = context.getBean(SimpleBean.class);
            System.out.println("SimpleBean example: " + simpleBean.toString());
        }catch (Exception exception){
            System.out.println("Bean simpleBean không tồn tại");
        }
    }
}
