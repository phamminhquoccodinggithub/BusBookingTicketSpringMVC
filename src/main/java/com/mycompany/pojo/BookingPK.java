/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Quoc
 */
@Embeddable
public class BookingPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "trip_id")
    private int tripId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "passenger_id")
    private int passengerId;

    public BookingPK() {
    }

    public BookingPK(int tripId, int passengerId) {
        this.tripId = tripId;
        this.passengerId = passengerId;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tripId;
        hash += (int) passengerId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookingPK)) {
            return false;
        }
        BookingPK other = (BookingPK) object;
        if (this.tripId != other.tripId) {
            return false;
        }
        if (this.passengerId != other.passengerId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pojo.BookingPK[ tripId=" + tripId + ", passengerId=" + passengerId + " ]";
    }
    
}
