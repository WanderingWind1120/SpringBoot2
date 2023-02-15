package SB4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main (String[] args){
        ApplicationContext context = SpringApplication.run(App.class,args);

        // Lấy ra bean GirlService
        GirlService girlService = context.getBean(GirlService.class);

        // Lấy ra random một cô gái từ tâng service
        Girl  girl = girlService.getRandomGirl();
        //In ra màn hình
        System.out.println(girl);
    }
}
