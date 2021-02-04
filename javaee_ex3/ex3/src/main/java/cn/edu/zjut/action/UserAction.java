package cn.edu.zjut.action;

import cn.edu.zjut.bean.ShoppingCart;
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

public class UserAction extends ActionSupport implements ServletRequestAware, ServletContextAware, ServletResponseAware {
    private Integer count = 0;

//    private Map request,session,application;
    private ServletContext context;
    private HttpServletRequest request;
    private HttpServletResponse response;

    public UserAction() {
        System.out.println("创建了一个UserAction类对象。");
    }

    public Integer getCount() {
        return count;
    }

    private UserBean loginUser;

    public UserBean getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(UserBean loginUser) {
        this.loginUser = loginUser;
    }

    public String login() {
        HttpServletRequest request =
                ServletActionContext.getRequest();
        HttpServletResponse response =
                ServletActionContext.getResponse();
        ServletContext application =
                ServletActionContext.getServletContext();
        HttpSession session = request.getSession();
        Integer counter = (Integer)context.getAttribute("counter");
        if(counter==null) counter=1;
        else counter=counter+1;
        context.setAttribute("counter", counter);
        UserService userServ = new UserService();
        if (userServ.login(loginUser)) {
            request.getSession().setAttribute("user", loginUser.getAccount());
            request.setAttribute("tip", "您已登录成功");
            request.getSession().setAttribute("shoppingcart", new ShoppingCart());
            return "success";
        } else {
            return "fail";
        }

//        this.request = ServletActionContext.getRequest();
//        this.response = ServletActionContext.getResponse();
//        this.context = ServletActionContext.getServletContext();
//        Integer counter = (Integer)context.getAttribute("counter");
//        if(counter==null) counter=1;
//        else counter=counter+1;
//        context.setAttribute("counter", counter);
//        UserService userServ = new UserService();
//        if (userServ.login(loginUser)) {
//            request.getSession().setAttribute("user", loginUser.getAccount());
//            request.setAttribute("tip", "您已登录成功");
//            return "success";
//        } else {
//            return "fail";
//        }

//        ActionContext ctx= ActionContext.getContext();
////通过ActionContext对象获取请求、会话和上下文对象相关联的Map对象
//        request=(Map) ctx.get("request");
//        session=(Map) ctx.getSession();
//        application=(Map) ctx.getApplication();
////访问application范围的属性值
//        Integer counter = (Integer)application.get("counter");
//        if(counter==null) counter=1;
//        else counter=counter+1;
////设置application范围的属性
//        application.put("counter", counter);
//        UserService userServ = new UserService();
//        if (userServ.login(loginUser)) {
////设置session范围的属性
//            session.put("user", loginUser.getAccount());
////设置request范围的属性
//            request.put("tip", "您已登录成功");
//            return "success";
//        } else {
//            return "fail";
//        }

//        count++;
//        UserService userServ = new UserService();
//        if (userServ.login(loginUser)) {
//            this.addActionMessage(this.getText("login.success"));
//            return "success";
//        } else {
//            this.addActionError(this.getText("login.error"));
//            return "fail";
//        }
    }

    public String register() {
        UserService userServ = new UserService();
        if (userServ.register(loginUser)) {

            return "registersuccess";
        }
        return "registerfail";
    }

    public String execute() {
        UserService userServ = new UserService();
        if (userServ.register(loginUser)) {
            return "success";
        }
        return "fail";
    }

    public void validateLogin() {
        String account = loginUser.getAccount();
        String pwd = loginUser.getPassword();
        if (account == null || account.equals("")) {
            this.addFieldError("loginUser.account", this.getText("login.account.null"));
        }
        if (pwd == null || pwd.equals("")) {
            this.addFieldError("loginUser.password", this.getText("login.password.null"));
        }
    }

    public void validateRegister() {
        String account = loginUser.getAccount();
        String address = loginUser.getAddress();
        String email = loginUser.getEmail();
        String phone = loginUser.getPhone();
        Date birthday = loginUser.getBirthday();
        String password = loginUser.getPassword();
        String repassword = loginUser.getRepassword();
        String name = loginUser.getName();
        if (account == null || account.equals("")) {
            this.addFieldError("loginUser.account", this.getText("register.account.null"));
        }
        if (password == null || password.equals("")) {
            this.addFieldError("loginUser.password", this.getText("register.password.null"));
        }
        if (address == null || address.equals("")) {
            this.addFieldError("loginUser.address", this.getText("register.address.null"));
        }
        if (repassword == null || repassword.equals("")) {
            this.addFieldError("loginUser.repassword", this.getText("register.repassword.null"));
        }
        if (name == null || name.equals("")) {
            this.addFieldError("loginUser.name", this.getText("register.name.null"));
        }
        if (birthday == null) {
            this.addFieldError("loginUser.birthday", this.getText("register.birthday.null"));
        }
        if (phone == null || phone.equals("")) {
            this.addFieldError("loginUser.phone", this.getText("register.phone.null"));
        }
        if (email == null || email.equals("")) {
            this.addFieldError("loginUser.email", this.getText("register.email.null"));
        }
        if (password != null && !password.equals("") && repassword != null && !repassword.equals("") && !password.equals(repassword)) {
            this.addFieldError("loginUser.pswformat", this.getText("register.repassword.examination"));
        }
    }

//    @Override
//    public void setApplication(Map<String, Object> application) {
//         this.application=application;
//    }
//
//    @Override
//    public void setRequest(Map<String, Object> request) {
//          this.request=request;
//    }
//
//    @Override
//    public void setSession(Map<String, Object> session) {
//            this.session=session;
//    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request=request;
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
         this.response=response;
    }

    @Override
    public void setServletContext(ServletContext context) {
         this.context=context;
    }
}