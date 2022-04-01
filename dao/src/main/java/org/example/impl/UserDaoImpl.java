package org.example.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.example.User;
import org.example.UserDao;
import org.example.util.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> getUsers() throws Exception {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        List<User> users = queryRunner.query("select * from user", new BeanListHandler<User>(User.class));
        return users;
    }
}
