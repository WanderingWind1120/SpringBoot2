package SB8;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController1 {
    @GetMapping("/")
    public String index(){
        return "index"; // trả về file index.html
    }
    @GetMapping("/about")
    public String about(){
        return "about"; // trả về file about.html
    }

    @GetMapping("/Hello")
    public String hello(@RequestParam(name = "name" , required = false, defaultValue =  "") String name, Model model){
       // Model là một object trong spring boot được gắn váo trong mọi request
        // Gắn vào model giá trị name nhận được
        model.addAttribute("name",name);
        return "hello"; // trả về file hello.html cùng với thông tin trong object model
    }
}
