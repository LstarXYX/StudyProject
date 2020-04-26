package service;

import dao.CustomerDaoImpl;
import dao.IcustomerDao;
import entity.CustomerEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import  utils.hibernateUtil;
import java.util.List;

/**
 * 客户业务层实现类
 * @author Lstar
 * @version 1.0
 * @date 2020/4/26 19:31
 * 事务控制在业务层
 */
public class customerServiceImpl implements ICustomerService {

    private IcustomerDao customerDao = new CustomerDaoImpl();

    @Override
    public List<CustomerEntity> findAllCustomer() {
        Session s = null;
        Transaction tx = null;
        try {
            //获取session
            s = hibernateUtil.getCurrentSession();
            //获取事务
            tx = s.beginTransaction();
            //执行操作
            List<CustomerEntity> customers = customerDao.findAllCustomer();
            //提交事务
            tx.commit();
            //返回结果
            return customers;
        }catch (Exception e){
            //回滚事务
            tx.rollback();
            throw new RuntimeException(e);
        }
    }
}
