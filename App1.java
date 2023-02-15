package SB5;

import SB5.others.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.tutorial.SpringBootLoda.SB5.others","com.tutorial.SpringBootData.SB4"})
@SpringBootApplication
public class App1 {
    public static void main (String[] args){
        ApplicationContext context = SpringApplication.run(App1.class, args);
        try{
            Girl girl = context.getBean(Girl.class);
            System.out.println("Bean: "+ girl.toString());
        }
        catch (Exception exception){
            System.out.println("Bean girl không tồn tại");
        }

        try{
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            System.out.println("Bean: "+ otherGirl.toString());
        }
        catch (Exception exception){

        }
    }
}
