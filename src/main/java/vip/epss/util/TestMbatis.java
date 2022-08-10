package vip.epss.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import vip.epss.dao.businessMapper;
import vip.epss.domain.business;

import java.io.InputStream;

public class TestMbatis {

    @Test
    public void TestMybatis(){

        //读取mybatis配置文件
        String resource = "mybatis.xml";
        InputStream inputStream = null;//静态工厂方法
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//建造者模式

        SqlSession sqlSession = sqlSessionFactory.openSession(true);//当前session是自动commit的
        //        sqlSession.方法();
        //拿到动态代理生成的实现类
        businessMapper businessMapper = sqlSession.getMapper(businessMapper.class);

        //        eleuserMapper.selectByExample(new EleuserExample().createCriteria().andUnameEqualTo("user1"))
//        eleuserMapper.inser
        business business = businessMapper.selectByPrimaryKey(1);
        System.out.println(business);


//        sqlSession.commit();
        sqlSession.close();

    }


}
