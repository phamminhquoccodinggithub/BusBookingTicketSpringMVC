package com.mycompany.pojo;

import com.mycompany.pojo.Trip;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-11T00:39:38")
@StaticMetamodel(Bus.class)
public class Bus_ { 

    public static volatile SingularAttribute<Bus, Integer> numSeat;
    public static volatile SingularAttribute<Bus, String> busNo;
    public static volatile ListAttribute<Bus, Trip> tripList;
    public static volatile SingularAttribute<Bus, Integer> id;

}