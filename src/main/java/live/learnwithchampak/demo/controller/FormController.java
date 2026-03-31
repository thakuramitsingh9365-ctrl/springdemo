package live.learnwithchampak.demo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import live.learnwithchampak.demo.model.UserForm;

@Controller
public class FormController {
   
    

    
    @GetMapping("/forms")
    public String form(Model model) {
        model.addAttribute("userForm", new UserForm());
        System.out.println("Get");
        return "form";
    }

    @PostMapping("/forms")
    public String submits(@ModelAttribute UserForm userForm, Model model) {
        model.addAttribute("message",
                model);
                        System.out.println("post");

        return "result";
    }
}
