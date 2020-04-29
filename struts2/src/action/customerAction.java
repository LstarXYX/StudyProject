package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.CustomerEntity;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;
import service.ICustomerService;
import service.customerServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Lstar
 * @version 1.0
 * @date 2020/4/27 14:19
 */
//指定当前包的父包
@ParentPackage(value = "struts-default")
//名称空间
@Namespace("/customer")
@Results({
        @Result(name = "success",type = "dispather",location = "list.jsp"),
        @Result(name = "error",location = "error.jsp")
})
public class customerAction extends ActionSupport {

    private ICustomerService customerService = new customerServiceImpl();
    /**
     * 查询所有客户
     * @return String
     */
    @Action(value = "findAllCustomer")
    public String findAllCustomer(){
        //调用service查询客户
        List<CustomerEntity> customers = customerService.findAllCustomer();
        //获取request对象
        HttpServletRequest request = ServletActionContext.getRequest();
        //把查询结果存入请求域
        request.setAttribute("customers",customers);
        //返回
        return SUCCESS;
    }
}
