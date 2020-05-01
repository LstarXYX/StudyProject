package test;

import dao.ICustomerDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ICustomerService;

/**
 * @author Lstar
 * @version 1.0
 * @date 2020/5/1 21:33
 */
public class client {
    /**
     * ClassPathXmlApplicationContext:只能加载类路径下的配置文件
     * FileSystemXmlApplicationContext:可以加载磁盘任意位置的配置文件
     *
     * Bean创建的两种规则：
     *  BeanFactory:
     *      提供一种延迟加载思想来创建Bean对象，Bean对象什么时候用什么时候创建
     *  ApplicationContex:
     *      提供一种立即加载思想来创建Bean对象，只要一解析完配置文件，就立马创建Bean对象
     *
     * @param args
     */
    public static void main(String[] args) {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据bean的id获取对象
        ICustomerService customerService = (ICustomerService) ac.getBean("customerService");
        ICustomerDao customerDao = (ICustomerDao) ac.getBean("customerDao");

        System.out.println(customerService);
        System.out.println(customerDao);
    }
}
