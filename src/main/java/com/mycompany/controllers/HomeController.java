/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Quoc
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index(Model model){
        model.addAttribute("name", "My Friend");
        return "index";
    }
    @RequestMapping("test/{name}")
    public String test(@PathVariable(name = "name") String name,
            Model model){
        model.addAttribute("name", name);
        return "index";
    }
    @RequestMapping("/test2")
    public String test2( Model model,
            @RequestParam(required = false) Map<String, String> params){
        String fn = params.get("firstName");
        String ln = params.get("lastName");
        model.addAttribute("name", fn + " " + ln);
        return "index";
    }
}
