package service;

import entity.CustomerEntity;

import java.util.List;

/**
 * 客户的业务层接口
 * @author Lstar
 * @version 1.0
 * @date 2020/4/26 19:30
 */
public interface ICustomerService {

    /**
     * 查询所有客户
     * @return
     */
    List<CustomerEntity> findAllCustomer();
}
