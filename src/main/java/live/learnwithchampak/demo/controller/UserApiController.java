package live.learnwithchampak.demo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/api/users")
public class UserApiController {
 
    @PostMapping
    public String createUser(@RequestBody UserRequest request) {
        return "Received " + request.getName() + " from " + request.getCity();
    }

     @GetMapping("/sample")
    public UserResponse sample() {
        return new UserResponse("User fetched", "success");
    }
}

