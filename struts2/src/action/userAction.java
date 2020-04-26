package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户的动作类
 * @author Lstar
 * @version 1.0
 * @date 2020/4/26 14:31
 */
public class userAction extends ActionSupport {
    /**
     * 保存
     * @return
     */
    public String addUser(){
        System.out.println("保存了用户");
        return SUCCESS;
    }
    /**
     * 更新
     * @return
     */
    public String updateUser(){
        System.out.println("更新了用户");
        return SUCCESS;
    }
    /**
     * 删除
     * @return
     */
    public String deleteUser(){
        System.out.println("删除了用户");
        return SUCCESS;
    }
    /**
     * 查询
     * @return
     */
    public String findUser(){
        System.out.println("查询了用户");
        return SUCCESS;
    }
}
