package com.mycompany.pojo;

import com.mycompany.pojo.Booking;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-11T00:39:38")
@StaticMetamodel(Passenger.class)
public class Passenger_ { 

    public static volatile SingularAttribute<Passenger, String> address;
    public static volatile SingularAttribute<Passenger, Integer> phone;
    public static volatile ListAttribute<Passenger, Booking> bookingList;
    public static volatile SingularAttribute<Passenger, String> name;
    public static volatile SingularAttribute<Passenger, Integer> id;
    public static volatile SingularAttribute<Passenger, String> email;

}