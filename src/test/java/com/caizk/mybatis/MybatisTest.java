package com.caizk.mybatis;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.caizk.mybatis.entity.Person;
import com.caizk.mybatis.entity.User;
 
 
public class MybatisTest {
    SqlSessionFactory factory;
 
    // 在测试用例执行前执行
    @Before
    public void init() throws IOException {
        // 在使用数据时，加载数据配置文件，在需时与数据库通信时，根据配置创建会话。
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(reader);
    }
     
    // 直接使用接口的测试用例：由mybatis相关功能创建方法与对应SQL操作id的映射
    @Test
    public void testDao() {
        // 创建会话
        SqlSession session = factory.openSession();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("username", "aaa");
        map.put("phone", "11111");
        List<User> list = session.selectList("selectAllUser", map);
        System.out.println("******************");
        for(User u : list){
        	  System.out.println(u.toString());
        }
        System.out.println("******************");
        session.close();
    }
    
    @Test
    public void testPerson(){
    	  SqlSession session = factory.openSession();
          Map<String,Object> map = new HashMap<String, Object>();
          map.put("age", 15);
          map.put("uid", 1);
          List<Person> list = session.selectList("selectByAge", map);
          System.out.println("******************");
          for(Person p : list){
          	  System.out.println(p.toString());
          }
          System.out.println("******************");
          session.close();
    }
}