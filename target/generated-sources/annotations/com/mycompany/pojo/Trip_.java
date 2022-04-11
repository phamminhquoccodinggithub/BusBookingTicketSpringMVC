package com.mycompany.pojo;

import com.mycompany.pojo.Booking;
import com.mycompany.pojo.Bus;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-11T00:39:38")
@StaticMetamodel(Trip.class)
public class Trip_ { 

    public static volatile SingularAttribute<Trip, Date> arriveTime;
    public static volatile SingularAttribute<Trip, Bus> busId;
    public static volatile SingularAttribute<Trip, Long> price;
    public static volatile ListAttribute<Trip, Booking> bookingList;
    public static volatile SingularAttribute<Trip, String> destination;
    public static volatile SingularAttribute<Trip, Integer> id;
    public static volatile SingularAttribute<Trip, String> source;
    public static volatile SingularAttribute<Trip, Date> depatureTime;

}