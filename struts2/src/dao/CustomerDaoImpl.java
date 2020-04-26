package dao;

import entity.CustomerEntity;
import utils.hibernateUtil;
import java.util.List;

/**
 * 客户的持久层实现类
 * @author Lstar
 * @version 1.0
 * @date 2020/4/26 19:36
 */
public class CustomerDaoImpl implements IcustomerDao {
    @Override
    public List<CustomerEntity> findAllCustomer() {
        return hibernateUtil.getCurrentSession().createQuery("from  CustomerEntity ").list();
    }
}
