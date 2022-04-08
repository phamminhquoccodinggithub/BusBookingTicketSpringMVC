/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Quoc
 */
@Entity
@Table(name = "booking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b"),
    @NamedQuery(name = "Booking.findByTripId", query = "SELECT b FROM Booking b WHERE b.bookingPK.tripId = :tripId"),
    @NamedQuery(name = "Booking.findByPassengerId", query = "SELECT b FROM Booking b WHERE b.bookingPK.passengerId = :passengerId"),
    @NamedQuery(name = "Booking.findBySeat", query = "SELECT b FROM Booking b WHERE b.seat = :seat")})
public class Booking implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BookingPK bookingPK;
    @Size(max = 45)
    @Column(name = "seat")
    private String seat;
    @JoinColumn(name = "passenger_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Passenger passenger;
    @JoinColumn(name = "trip_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Trip trip;

    public Booking() {
    }

    public Booking(BookingPK bookingPK) {
        this.bookingPK = bookingPK;
    }

    public Booking(int tripId, int passengerId) {
        this.bookingPK = new BookingPK(tripId, passengerId);
    }

    public BookingPK getBookingPK() {
        return bookingPK;
    }

    public void setBookingPK(BookingPK bookingPK) {
        this.bookingPK = bookingPK;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingPK != null ? bookingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.bookingPK == null && other.bookingPK != null) || (this.bookingPK != null && !this.bookingPK.equals(other.bookingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pojo.Booking[ bookingPK=" + bookingPK + " ]";
    }
    
}
