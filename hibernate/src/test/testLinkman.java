package test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import bean.*;

/**
 * @author Lstar
 * @version 1.0
 * @date 2020/4/21 17:55
 * 一对多关系映射的CRUD
 *
 */
public class testLinkman {
    /**
     * 保存操作
     * 创建一个新的联系人，需要关联一个客户
     */
    @Test
    public void test1(){
        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //查询一个客户
        CustomerEntity c1 = s.get(CustomerEntity.class,96L);
        //创建一个新的联系人
        LinkmanEntity l = new LinkmanEntity();
        l.setLkmName("一对多的联系人");
        //创建客户和联系人的关系 让联系人知道属于哪个客户
        l.setCustomer(c1);
        //保存联系人
        s.save(l);

        tx.commit();

    }

    /**
     * 特殊情况
     *  创建一个客户和一个联系人
     *  建立客户和联系人的双向关联关系
     *  使用符合原则的保存： 先保存主表实体，再保存从表实体
     *      此时保存会有问题
     *           保存了两个实体 理应只有两条insert语句
     *           而执行结果多了一条update语句    因为快照更新
     *      解决办法：
     *          让客户执行操作的时候，放弃维护关联关系的权利
     *          配置的方式：
     *              在Customer的映射配置文件中的set标签上使用inverse属性
     *               inverse含义：是否放弃维护关联关系的权利
     *                       true：放弃
     *                       false：不放弃（默认）
     */
    @Test
    public void test2(){
        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //创建一个客户
        CustomerEntity c1 =new CustomerEntity();
        c1.setCustName("一对多的客户2");
        //创建一个新的联系人
        LinkmanEntity l = new LinkmanEntity();
        l.setLkmName("一对多的联系人2");
        //创建客户和联系人的关系 双向
        l.setCustomer(c1);
        c1.getLinkman().add(l);
        //保存联系人
        s.save(c1);//持久态 有一级缓存和快照
        s.save(l);//持久态 有一级缓存和快照
        tx.commit();

    }


    /**
     * 级联保存
     * 配置方式 找到customer的映射配置文件set标签
     *     加入cascade属性
     *          cascade：配置级联操作
     *              级联保存更新的取值： save-update
     *
     */

    @Test
    public void test3(){
        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //创建一个客户
        CustomerEntity c1 =new CustomerEntity();
        c1.setCustName("级联保存");
        //创建一个新的联系人
        LinkmanEntity l = new LinkmanEntity();
        l.setLkmName("级联保存");
        //创建客户和联系人的关系 双向
        l.setCustomer(c1);
        c1.getLinkman().add(l);
        //保存联系人
        s.save(c1);//只保存一个就可 级联保存
        tx.commit();
    }

}
