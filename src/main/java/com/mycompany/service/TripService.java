/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.pojo.Trip;
import java.util.List;

/**
 *
 * @author Quoc
 */
public interface TripService {
    public List<Trip> getTrips(String kw);
}
