/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.impl;

import com.mycompany.pojo.Trip;
import com.mycompany.repository.TripRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Quoc
 */
@Repository
@Transactional
public class TripRepositoryImpl implements TripRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Override
    public List<Trip> getTrips(String kw) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaQuery<Trip> q = b.createQuery(Trip.class);
        Root root = q.from(Trip.class);
        q.select(root);
        if(kw!=null && !kw.isEmpty()){
            Predicate p = b.like(root.get("name").as(String.class),
                    String.format("%%%s%%", kw));
            q.where(p);
        }
        q.orderBy(b.desc(root.get("id")));
        Query query = session.createQuery(q);
        return query.getResultList();
    }    

    @Override
    public boolean addOrUpdateTrip(Trip trip) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        try {
            session.save(trip);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
