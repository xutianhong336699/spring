package Dbutils;

import cn.Dbutils.entity.User;
import cn.Dbutils.util.JDBCutil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class test{
    @Test
    public void addUser( ) {
        // 创建QueryRunner对象，用来操作sql语句
        QueryRunner qr = JDBCutil.getQR();
        // 增
        User user = new User("北大青鸟","123456");
        String sql = "insert into user (name,pwd) values(?,?)";
        Integer count = 0;
        try {
            count = qr.update(sql,user.getName(),user.getPwd());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }

    @Test
    public void deleteUser(){
        // 创建QueryRunner对象，用来操作sql语句
        QueryRunner qr = JDBCutil.getQR();
        // 删
        String sql = "delete from user where id=? ";
        Integer count = 0;
        try {
            count = qr.update(sql,5);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }

    @Test
    public void updateUser(){
        // 创建QueryRunner对象，用来操作sql语句
        QueryRunner qr = JDBCutil.getQR();
        // 删
        User user = new User(4,"T23","123321");
        String sql = "update user set name=?,pwd=? where id=?";
        Integer count = 0;
        try {
            count = qr.update(sql,user.getName(),user.getPwd(),user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }

    @Test
    public void findAllUser(){
        // 创建QueryRunner对象，用来操作sql语句
        QueryRunner qr = JDBCutil.getQR();
        // 查全
        String sql = "select * from user";
        List<User> list = null;
        try {
            list = qr.query(sql, new BeanListHandler <User>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (User item:list) {
            System.out.println(item.getName());
        }
    }

    @Test
    public void findOneUser() throws SQLException {
        // 创建QueryRunner对象，用来操作sql语句
        QueryRunner qr = JDBCutil.getQR();
        // 查一个
        String sql = "select * from user where id=? ";
        User user = qr.query(sql,1,new BeanHandler<User>(User.class));
        System.out.println(user.getName());
    }
}
