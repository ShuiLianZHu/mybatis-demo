package com.caizk.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.caizk.mybatis.dao.IUserDao;
import com.caizk.mybatis.entity.User;

public class UserDaoImpl implements IUserDao {

    SqlSessionFactory factory = null;
     
    public UserDaoImpl() {
    }
     
    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }
 
    public SqlSessionFactory getFactory() {
        return factory;
    }
 
    public void setFactory(SqlSessionFactory factory) {
        this.factory = factory;
    }
 
    public long insert(User user) {
        SqlSession session = factory.openSession();
         
        session.insert("insert", user);
         
        return user.getUserId();
    }
 
    public long update(User user) {
        SqlSession session = factory.openSession();
         
        session.update("update", user);
         
        return user.getUserId();
    }
 
    public long delete(long userId) {
        SqlSession session = factory.openSession();
         
        session.delete("delete", userId);
         
        return userId;
    }
 
    public List<User> selectAllUser() {
        SqlSession session = factory.openSession();
         
        List<User> userList = session.selectList("selectAllUser");
         
        return userList;
    }
 
    public User selectUserById(long userId) {
        SqlSession session = factory.openSession();
         
        User user = session.selectOne("selectUserById", userId);
         
        return user;
    }
}