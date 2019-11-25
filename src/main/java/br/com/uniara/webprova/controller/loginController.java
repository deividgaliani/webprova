package br.com.uniara.webprova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {

//    @RequestMapping(value = "/login")
//    public String login(Model model, String error, String logout) {
//        if (error != null)
//            model.addAttribute("errorMsg", "Your username and password are invalid.");
//
//        if (logout != null)
//            model.addAttribute("msg", "You have been logged out successfully.");
//
//        return "login";
//    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value={"", "/", "index"})
    public String index() {
        return "prova/index";
    }

}
