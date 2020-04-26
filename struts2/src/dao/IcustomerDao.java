package dao;

import entity.CustomerEntity;

import java.util.List;

/**
 * 客户的持久层接口
 * @author Lstar
 * @version 1.0
 * @date 2020/4/26 19:35
 */
public interface IcustomerDao {

    /**
     * 查询所有客户
     * @return
     */
    List<CustomerEntity> findAllCustomer();
}
