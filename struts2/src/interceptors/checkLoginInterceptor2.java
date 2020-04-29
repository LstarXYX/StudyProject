package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

/**
 * @author Lstar
 * @version 1.0
 * @date 2020/4/29 14:25
 */
public class checkLoginInterceptor2 extends MethodFilterInterceptor {

    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        Object object = ServletActionContext.getRequest().getSession().getAttribute("userinfo");
        if (object==null){
            //没登录 去登录
            return "login";
        }
        return actionInvocation.invoke();
    }
}
