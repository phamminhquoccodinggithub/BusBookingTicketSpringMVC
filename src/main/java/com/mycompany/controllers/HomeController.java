/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;


import com.mycompany.pojo.Bus;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @RequestMapping("/")
    @Transactional
    public String index(Model model){
        Session session = sessionFactory.getObject().getCurrentSession();
        Query q =session.createQuery("From Bus");
        List<Bus> buses =  q.getResultList();
//        session.close();
        model.addAttribute("name", "Nguyen Van A");
        model.addAttribute("buses", buses);
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
