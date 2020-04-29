package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 自定义拦截器
 *      1、写一个普通类继承AbstractInterceptor 也可以h实现Interceptor接口
 *      2、配置拦截器
 *      3、引用拦截器
 *              当使用了自己的拦截器时，默认的拦截器失效了
 *             <interceptor-ref name="myInterceptor"></interceptor-ref>
 *
 *  拦截器的放行
 *      actionInvocation.invoke();     //放行
 *  返回值的内容是：动作方法的返回值
 *  关于结果视图的执行时机以及拦截器的返回值问题
 *      在放行前，拦截器返回值可以k控制显示哪个结果视图，一旦放行后，一定会显示动作结果的视图
 *
 * 多个拦截器的顺序：与引用顺序有关，跟声明顺序无关
 * @author Lstar
 * @version 1.0
 * @date 2020/4/29 10:15
 */
public class MyInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("拦截了");
        String rtValue = actionInvocation.invoke();     //放行
        System.out.println("访问Action之后：拦截了");
        return rtValue;
    }
}
