package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author Lstar
 * @version 1.0
 * @date 2020/4/29 13:55
 */
public class Myinterceptors2 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("2拦截了");
        String rtValue = actionInvocation.invoke();     //放行
        System.out.println("访问Action之后：2拦截了");
        return rtValue;
    }
}
