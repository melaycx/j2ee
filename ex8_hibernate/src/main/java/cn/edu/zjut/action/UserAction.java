package cn.edu.zjut.action;
import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.IUserService;

public class UserAction {
    private Customer loginUser;
    private IUserService userService = null; //省略 loginUser 的 getters/setters 方法

    public Customer getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(Customer loginUser) {
        this.loginUser = loginUser;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public String execute() {
        userService.register(loginUser);
        return "success";
    }

}