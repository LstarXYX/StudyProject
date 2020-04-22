package test;

import bean.CustomerEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.List;

/**
 * Criteria查询
 * 获取对象
 *      session.creatCriteria(Class clazz)
 *
 */
public class test2 {

    //基本查询
    //效率比hql低
    @Test
    public void test(){
        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        Criteria criteria = s.createCriteria(CustomerEntity.class);
        //获取结果集
        List list = criteria.list();
        for (Object o : list){
            System.out.println(o);
        }
        tx.commit();
    }


}
