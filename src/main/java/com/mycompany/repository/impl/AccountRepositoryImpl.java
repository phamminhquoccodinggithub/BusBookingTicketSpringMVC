/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.impl;

import com.mycompany.pojo.Account;
import com.mycompany.pojo.Trip;
import com.mycompany.repository.AccountRepository;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
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
public class AccountRepositoryImpl implements AccountRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Override
    public boolean addAccount(Account account) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        try {
            session.save(account);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Account getAccountByUserName(String username) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaQuery<Account> q = b.createQuery(Account.class);
        Root root = q.from(Account.class);
        q.select(root);
        
        q.where(b.equal(root.get("username"), username));
        Query query = session.createQuery(q);
        return (Account) query.getSingleResult();
    }
    
}
