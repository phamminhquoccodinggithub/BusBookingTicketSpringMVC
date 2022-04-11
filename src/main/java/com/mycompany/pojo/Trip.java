/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Quoc
 */
@Entity
@Table(name = "trip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trip.findAll", query = "SELECT t FROM Trip t"),
    @NamedQuery(name = "Trip.findById", query = "SELECT t FROM Trip t WHERE t.id = :id"),
    @NamedQuery(name = "Trip.findBySource", query = "SELECT t FROM Trip t WHERE t.source = :source"),
    @NamedQuery(name = "Trip.findByDestination", query = "SELECT t FROM Trip t WHERE t.destination = :destination"),
    @NamedQuery(name = "Trip.findByDepatureTime", query = "SELECT t FROM Trip t WHERE t.depatureTime = :depatureTime"),
    @NamedQuery(name = "Trip.findByArriveTime", query = "SELECT t FROM Trip t WHERE t.arriveTime = :arriveTime"),
    @NamedQuery(name = "Trip.findByPrice", query = "SELECT t FROM Trip t WHERE t.price = :price")})
public class Trip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "source")
    private String source;
    @Size(max = 45)
    @Column(name = "destination")
    private String destination;    
    @Column(name = "depature_time")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date depatureTime;
    @Column(name = "arrive_time")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date arriveTime;
    @Column(name = "price")
    private Long price;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trip")
    private List<Booking> bookingList;
    @JoinColumn(name = "bus_id", referencedColumnName = "id")
    @ManyToOne
    private Bus busId;

    public Trip() {
    }

    public Trip(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(Date depatureTime) {
        this.depatureTime = depatureTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @XmlTransient
    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public Bus getBusId() {
        return busId;
    }

    public void setBusId(Bus busId) {
        this.busId = busId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trip)) {
            return false;
        }
        Trip other = (Trip) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.pojo.Trip[ id=" + id + " ]";
    }
    
}
