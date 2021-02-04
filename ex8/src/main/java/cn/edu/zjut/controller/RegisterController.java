package cn.edu.zjut.controller;

import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class RegisterController {
    @RequestMapping(value = "/register", method = GET)
    public ModelAndView register() {
        return new ModelAndView("register.jsp", "customer", new Customer());
    }

    private IUserService userService;
    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/register", method = POST)
    public String register(@ModelAttribute("customer") Customer customer) {
        userService.register(customer);
        return "registerSuccess.jsp";
    }


}
