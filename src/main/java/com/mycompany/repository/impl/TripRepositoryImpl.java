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
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Quoc
 */
@Repository
@Transactional
@PropertySource("classpath:info.properties")
public class TripRepositoryImpl implements TripRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Autowired
    private Environment env;
    @Override
    public List<Trip> getTrips(String kw, int page) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaQuery<Trip> q = b.createQuery(Trip.class);
        Root root = q.from(Trip.class);
        q.select(root);
        if(kw!=null && !kw.isEmpty()){
            Predicate p = b.like(root.get("source").as(String.class),
                    String.format("%%%s%%", kw));
            q.where(p);
        }
        q.orderBy(b.desc(root.get("id")));
        Query query = session.createQuery(q);
        int pageSize = Integer.parseInt(env.getProperty("info.page_size"));
        int start = (page -1) * pageSize;
        
        query.setMaxResults(pageSize);
        query.setFirstResult(start);
        
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

    @Override
    public int countTrips() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery(("Select count(*) from Trip "));
        Object re = q.getSingleResult();
        return  Integer.parseInt(re.toString());
    }
}
