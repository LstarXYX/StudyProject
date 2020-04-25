package action;

import com.opensymphony.xwork2.Action;

/**
 * 通过实现接口的方式创建动作类
 * @author Lstar
 * @version 1.0
 * @date 2020/4/25 16:57
 */
public class hello2Action implements Action {

    @Override
    public String execute() throws Exception {
        System.out.println("hello2Action的execute的方法执行了");
        return SUCCESS;
    }

}
