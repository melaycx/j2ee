package cn.edu.zjut.app;

import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.edu.zjut.dao.ICustomerDAO;

public class SpringEnvTest {
    public static void main(String[] args) {
        //创建 Spring 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //获取 CustomerDAO 实例
//        ICustomerDAO userDao = (ICustomerDAO) ctx.getBean("userDAO");
//        userDao.save();
        //获取 UserService 实例
        IUserService userService = (IUserService) ctx.getBean("userService");
        Customer cust = new Customer();
        cust.setCustomerId(123);
        cust.setAccount("SPRING");
        cust.setPassword("SPRING");
        userService.register(cust);
    }
}
