package dao;

/**
 * @author Lstar
 * @version 1.0
 * @date 2020/5/1 21:25
 */
public class ImpCustomerDao implements ICustomerDao {
    @Override
    public void saveCustomer() {
        System.out.println("dao层");
    }
}
