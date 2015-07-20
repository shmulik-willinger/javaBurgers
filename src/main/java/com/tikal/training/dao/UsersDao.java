package com.tikal.training.dao;

import com.tikal.training.dao.base.BasicDao;
import com.tikal.training.model.ExampleEntity;
import com.tikal.training.model.Users;

public interface UsersDao extends BasicDao<Users>
{
    Users GetUserByName(String name);
}
