package cn.edu.zjut.service;

import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.exception.UserException;

public class UserService {
    public boolean login(UserBean loginUser) throws Exception{
        if (loginUser.getAccount().equalsIgnoreCase("admin")){ throw new UserException("用户名不能为admin");
        } if (loginUser.getPassword().toUpperCase().contains(" AND ")
                ||loginUser.getPassword().toUpperCase().contains(" OR ")){ throw new java.sql.SQLException("密码不能包括' and '或' or '");
        } if (loginUser.getAccount().equals(loginUser.getPassword())) {
            return true;
        } else
            return false;
    }

    public boolean register(UserBean registerUser) {
        if (registerUser.getPassword().equals(registerUser.getRepassword()) && registerUser.getPassword().equals(registerUser.getAccount()) && registerUser.getPassword() != "") {
            return true;
        }
        return false;
    }
}