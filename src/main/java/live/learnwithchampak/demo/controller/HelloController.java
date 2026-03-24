package live.learnwithchampak.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Spring Starter v2 is running.";
    }

    @GetMapping("/ping")
    public String ping() {
        return "cong";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    
    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b ){
        return "" + (a+b);
    }

    @GetMapping("/mul")
    public String mul(@RequestParam int a,@RequestParam int n){
        return "Multiply" + a*n;
    }
}
