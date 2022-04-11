package com.mycompany.pojo;

import com.mycompany.pojo.BookingPK;
import com.mycompany.pojo.Passenger;
import com.mycompany.pojo.Trip;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-11T00:39:38")
@StaticMetamodel(Booking.class)
public class Booking_ { 

    public static volatile SingularAttribute<Booking, String> seat;
    public static volatile SingularAttribute<Booking, Trip> trip;
    public static volatile SingularAttribute<Booking, Passenger> passenger;
    public static volatile SingularAttribute<Booking, BookingPK> bookingPK;

}