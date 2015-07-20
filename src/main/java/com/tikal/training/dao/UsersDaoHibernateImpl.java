package com.tikal.training.dao;

import com.tikal.training.dao.ExampleDao;
import com.tikal.training.dao.base.AbstractDao;
import com.tikal.training.model.ExampleEntity;
import com.tikal.training.model.Users;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class UsersDaoHibernateImpl extends AbstractDao<Users> implements UsersDao {

    @Override
    public Users GetUserByName(String userName) {
        String hql = "select user from Users as user where name = :name";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("name", userName);

        Users user = (Users)query.uniqueResult();

        return user;
    }
}
