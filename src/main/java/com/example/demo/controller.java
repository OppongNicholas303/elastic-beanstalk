package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class controller {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", "My First Elastic Beanstalk Deploy");
        model.addAttribute("heroTitle", "This app is deployed by elastic beanstalk");
        model.addAttribute("heroDescription", "AWS Lab Week 3 Work");
        model.addAttribute("isAuthenticated", false); // Set based on authentication status
        model.addAttribute("companyName", "Amalitec");
        return "index";
    }

}
