// package live.learnwithchampak.demo.controller;
package live.learnwithchampak.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    

    @GetMapping("/")
    public String allUsers() {
        return "All users";
    }

    @GetMapping("/active")
    public String activeUsers() {
        return "Active users";
    }

     
   @RequestMapping("/users")
public class UserControllers {

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        return "User id = " + id;
    }
}
  
   @GetMapping("/{userId}/orders/{orderId}")
public String getOrder(@PathVariable int userId,
                       @PathVariable int orderId) {
    return "User " + userId + ", Order " + orderId;
}
}
