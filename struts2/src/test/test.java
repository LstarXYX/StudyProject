package test;
import dao.IcustomerDao;
import entity.CustomerEntity;
import org.junit.Test;
import service.ICustomerService;
import service.customerServiceImpl;

import java.util.List;

/**
 * 测试客户的业务层和持久层
 * @author Lstar
 * @version 1.0
 * @date 2020/4/26 19:54
 */
public class test {

    @Test
    public void testFindAllCustomer(){
        ICustomerService customerService = new customerServiceImpl();
        List<CustomerEntity> customers = customerService.findAllCustomer();
        for (CustomerEntity c : customers)
        {
            System.out.println(c);
        }
    }
}
