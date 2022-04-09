/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.Bus;
import com.mycompany.repository.BusRepository;
import com.mycompany.service.BusService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Quoc
 */
@Service
public class BusServiceImpl implements BusService{
    @Autowired
    private BusRepository busRepository;
    @Override
    public List<Bus> getBuses() {
        return this.busRepository.getBuses();
    }
    
    
}
