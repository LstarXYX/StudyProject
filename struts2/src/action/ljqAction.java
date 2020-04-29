package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Lstar
 * @version 1.0
 * @date 2020/4/29 10:19
 */
public class ljqAction extends ActionSupport {
    public String ljq(){
        System.out.println("ljqAction中的ljq方法执行了");
        return SUCCESS;
    }
}
