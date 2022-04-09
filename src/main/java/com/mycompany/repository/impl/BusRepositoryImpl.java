/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.impl;

import com.mycompany.pojo.Bus;
import com.mycompany.repository.BusRepository;
import java.util.List;
import javax.persistence.Query;
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
public class BusRepositoryImpl implements BusRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Override
    public List<Bus> getBuses() {
        Session session = sessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery("From Bus");
        return q.getResultList();
    }
    
}
