package com.tikal.training.services;

import com.tikal.training.dao.UsersDao;
import com.tikal.training.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UsersBusinessService {
    @Autowired
    private UsersDao usersDao;

    @Transactional
    public Users getById(Integer id) {
        return usersDao.read(Users.class, id);
    }

    @Transactional
    public void saveUser(Users user) throws Exception
    {
        if (ValidateUniqeUserName(user))
            usersDao.create(user);
        else
            throw new Exception("User already exist");
    }

    private boolean ValidateUniqeUserName(Users user)
    {
        Users userWithSameName = usersDao.GetUserByName(user.getName());
        return userWithSameName == null;
    }

    @Transactional
    public void update(Users user) {
        usersDao.update(user);
    }
}
