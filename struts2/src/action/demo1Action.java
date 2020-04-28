package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * ActionContext的数据存取
 * @author Lstar
 * @version 1.0
 * @date 2020/4/28 19:25
 */
public class demo1Action extends ActionSupport {
    /**
     * 通过actiontext往contextMap中存入数据
     * 用两种方式实现往里存数据
     *      applicationMap   hello application map
     *      applicationAttr  applicationAttr
     *      key：contextMap  value：context map
     * 往会话域存入数据 两种方式
     * @return
     */
    public String demo1(){
        //获取actioncontext
        ActionContext context = ActionContext.getContext();
        //存入数据
        context.put("contextMap","hello context map");

        //往应用域存数据
        //1. 用原始ServletAPI对象servletContext
        ServletContext applicationAttr = ServletActionContext.getServletContext();
        applicationAttr.setAttribute("applicationAttr","applicationAttr");
        //第二种
        Map<String,Object> applicationMap = context.getApplication();
        applicationMap.put("applicationMap","hello application map");

        //往会话域传入
        //ServletAPI的HttpSession
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute("sessionAtr","session atr");
        //回去Key为Session的map
        Map<String,Object> sessionMap = context.getSession();
        sessionMap.put("sessionAtr","sessionmap");

        return SUCCESS;
    }
}
