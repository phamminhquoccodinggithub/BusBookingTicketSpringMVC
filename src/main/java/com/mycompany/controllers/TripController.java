/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.pojo.Trip;
import com.mycompany.service.BusService;
import com.mycompany.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Quoc
 */
@Controller
@RequestMapping("/admin")
public class TripController {
    @Autowired
    private TripService tripService;
    @Autowired
    private BusService busService;
    @GetMapping("/trip-add")
    public String addView(Model model){
        model.addAttribute("buses", this.busService.getBuses());
        model.addAttribute("trip", new Trip());
        return "trip";
    }
    @PostMapping("/trip-add")
    public String addHandler(Model model,
            @ModelAttribute(value = "trip") Trip t){
        if(this.tripService.addOrUpdateTrip(t)==true)
            return "redirect:/";
        model.addAttribute("errMsg", "Somgthing wrong!! Please try again");
        return "trip";
    }
}
