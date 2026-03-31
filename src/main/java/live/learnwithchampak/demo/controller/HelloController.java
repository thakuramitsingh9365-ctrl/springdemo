package live.learnwithchampak.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello1")
    public String home() {
        return "Hello1";
    }
  
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam(defaultValue = "World") String name) {
    return "Hello " + name + "!";
}
  
   @GetMapping("/hello3")
    public String hello3(@RequestParam(required = false) String name) {
    if (name == null || name.isBlank()) {
        return "Hello Guest!";
    }
    return "Hello " + name + "!";
}

   @GetMapping("/search")
public String search(@RequestParam String keyword,
                     @RequestParam String city) {
    return "Searching for " + keyword + " in " + city;
}

    }
    
