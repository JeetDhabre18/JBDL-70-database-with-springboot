package com.gfg.JBDL70databasewithspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/v2")
public class Controllerdemo2 {
    @GetMapping("/demo")
    public  String getDemo() {
        return "Demo2";
    }
    //mvc framework example
    @GetMapping("/dynamic-demo")
    public ModelAndView getDynamicDemo() {
        ModelAndView modelAndView = new ModelAndView("dynamicdemo.html");
        modelAndView.getModelMap().addAttribute("name","john");
        return modelAndView;
    }
}
