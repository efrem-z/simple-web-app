package ru.ez.simpleWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.ez.simpleWebApp.domain.User;
import ru.ez.simpleWebApp.service.UserService;

import java.util.Map;

@Controller
public class RegistrationController {
    private UserService userService;
    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> model){
        if(!userService.addUser(user)){
            model.put("message","User exists!");
            return "registration";
        }


        return "redirect:/login";
    }

    @GetMapping("/activate/{code}")
    public String acitvate(Model model, @PathVariable String code){
        boolean isActivated = userService.activateUser(code);

        if (isActivated) {
            model.addAttribute("message", "user activated");
        } else {
            model.addAttribute("message", "activation code not found");
        }

        return "login";
    }
}
