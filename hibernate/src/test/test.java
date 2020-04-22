package test;

import bean.CustomerEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;


/**
 * hibernate的一级缓存
 */

public class test {
    @Test
    public void test(){
        Session s = hibernateUtil.openSession();
        Transaction tx = s.beginTransaction();
        //根据id查询客户
        CustomerEntity c = s.get(CustomerEntity.class,96L);
        System.out.println(c.getCustName());
        //再次查询
        CustomerEntity c2 = s.get(CustomerEntity.class,96L);
        System.out.println(c2.getCustId());

        tx.commit();
        s.close();//session关闭 缓存消失
    }


    @Test
    public void test2(){
        Session s = hibernateUtil.openSession();
        Transaction tx = s.beginTransaction();
        //根据id查询客户
        CustomerEntity c = s.get(CustomerEntity.class,96L);
        c.setCustAddress("广东清远");
        s.update(c);

        tx.commit();
        s.close();//session关闭 缓存消失
    }

    //基本查询
    @Test
    public void test3(){
        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //查询所有对象
        //1、获取Query对象
        Query query  = s.createQuery("from CustomerEntity ");
        //2、执行获取结果集
        List list = query.list();
        for (Object o : list){
            System.out.println(o);
        }
        tx.commit();
    }

    //条件查询
    @Test
    public void test4(){
        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //查询所有对象
        //1、获取Query对象
        Query query  = s.createQuery("from CustomerEntity where custLevel = ?1");
        //2、给参数占位符赋值
        query.setParameter(1,"4");
        //占位符从1开始
        //2、执行获取结果集
        List list = query.list();
        for (Object o : list){
            System.out.println(o);
        }
        tx.commit();
    }

    //排序
    @Test
    public void test5(){
        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //查询所有对象
        //1、获取Query对象
        Query query  = s.createQuery("from CustomerEntity order by custId desc");
        //2、执行获取结果集
        List list = query.list();
        for (Object o : list){
            System.out.println(o);
        }
        tx.commit();
    }

    /**
     * 分页查询
     * 两个方法
     *      1、setFirstResult    查询的开始
     *      2、setMaxResults     查询的条数
     */
    @Test
    public void test6(){
        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //查询所有对象
        //1、获取Query对象
        Query query  = s.createQuery("from CustomerEntity ");
        query.setFirstResult(93);
        query.setMaxResults(3);
        //2、执行获取结果集
        List list = query.list();
        for (Object o : list){
            System.out.println(o);
        }
        tx.commit();
    }

    /**
     * 统计查询
     * 使用聚合函数：count sum avg max min
     */
    @Test
    public void test7(){
        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //查询所有对象
        //1、获取Query对象
        Query query  = s.createQuery("select count(*) from CustomerEntity");

        //2、执行获取结果集
//        List list = query.list();
//        for (Object o : list){
//            System.out.println(o);
//        }
      long count =(long)query.uniqueResult();
        //当返回结果唯一时
        System.out.println(count);
        tx.commit();
    }

    /**
     * 投影查询
     *只需要部分字段 希望返回实体类封装 不是object数组
     *
     * 用法：
     *      1、查询语句要用new
     *      2、在实体类中添加对应列表的构造函数
     */
    @Test
    public void test8(){
        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //查询所有对象
        //1、获取Query对象
        Query query  = s.createQuery("select new CustomerEntity(custId,custName) from CustomerEntity ");
        //2、执行获取结果集
        List<CustomerEntity> list = query.list();
        for (CustomerEntity os : list){
            System.out.println(os.getCustId()+"//////"+os.getCustName());
        }
        tx.commit();
    }

}
