package cn.edu.zjut.action;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.*;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

public class UserAction extends ActionSupport {
    private UserBean loginUser;
    private Map session;

    public UserBean getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(UserBean loginUser) {
        this.loginUser = loginUser;
    }

    public String execute() {
        UserService userServ = new UserService();
        if (userServ.register(loginUser)) {
            return "success";
        }
        return "fail";
    }

    public String login() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        UserService userServ = new UserService();
        try {
            if (userServ.login(loginUser)) {
                session.put("user", loginUser.getAccount());
                return "success";
            } else {
                return "fail";
            }
        } catch (Exception exception) {
            throw exception;

        }
    }


    public String register() {
        UserService userServ = new UserService();
        if (userServ.register(loginUser)) {
            return "registersuccess";
        }
        return "registerfail";
    }
}