package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

/**
 * @author Lstar
 * @version 1.0
 * @date 2020/4/29 14:09
 */
public class BBSAction extends ActionSupport {
    /**
     * 板块1
     */
    public String Act1(){
        System.out.println("板块1");
        return SUCCESS;
    }

    /**
     * 板块2
     */
    public String Act2(){
        System.out.println("板块2");
        return SUCCESS;
    }

    /**
     * 板块3
     */
    public String Act3(){
        System.out.println("板块3");
        return SUCCESS;
    }

    /**
     * 登录
     */
    public String userlogin(){
        //往session域存入登录标记
        ServletActionContext.getRequest().getSession().setAttribute("userinfo","1");
        return SUCCESS;
    }

}
