package cn.day03.dao;

import cn.day03.entity.User;

public class UserDaoImpl implements UserDao{
    @Override
    public void saveUser(User user) {
        System.out.println("save user ok!");
    }
}
