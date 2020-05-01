package service;

import dao.ICustomerDao;

/**
 * @author Lstar
 * @version 1.0
 * @date 2020/5/1 21:23
 */
public class ImpCustomerService implements ICustomerService {
    private ICustomerDao customerDao = null;
    @Override
    public void saveCustomer() {
        System.out.println("业务层调用dao层");
    }
}
