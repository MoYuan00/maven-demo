package org.example;

import org.example.impl.UserDaoImpl;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUsers() throws Exception {

        UserDao userDao = new UserDaoImpl();
        List<User> users = userDao.getUsers();
        System.out.println(users);
    }

}
