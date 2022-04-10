/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.Trip;
import com.mycompany.repository.TripRepository;
import com.mycompany.service.TripService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Quoc
 */
@Service
public class TripServiceImpl implements TripService{
    @Autowired
    private TripRepository tripRepository;
    
    @Override
    public List<Trip> getTrips(String kw) {
        return this.tripRepository.getTrips(kw);
    }

    @Override
    public boolean addOrUpdateTrip(Trip trip) {
        return this.tripRepository.addOrUpdateTrip(trip);
    }
    
}
