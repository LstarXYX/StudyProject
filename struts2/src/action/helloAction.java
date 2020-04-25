package action;

/**
 *
 * 第一个动作类
 *  处理请求
 * @author Lstar
 * @version 1.0
 * @date 2020/4/25 15:00
 */
public class helloAction {

    /**
     * 动作方法
     *      动作类中用于处理请求的方法
     * 编写规范:
     *      1、访问修饰符是 public
     *      2、返回值一般都是 String （可以是void）
     *      3、方法都没有参数
     * @return string
     */
    public String sayHello(){
        System.out.println("helloAction 的 sayHello 方法执行了");
        return "success";
    }
}
