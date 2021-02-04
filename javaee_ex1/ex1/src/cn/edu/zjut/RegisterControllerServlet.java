package cn.edu.zjut;

import cn.edu.zjut.dao.UserDAO;
import cn.edu.zjut.model.UserBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterControllerServlet",urlPatterns = "/register")
public class RegisterControllerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password1");

        UserBean user=new UserBean();
        user.setUsername(username);
        user.setPassword(password);

        if(checkUser(user)){
            request.setAttribute("USER", user);
            RequestDispatcher dispatcher = request
                    .getRequestDispatcher("/registerSuccess.jsp");
            dispatcher.forward(request, response);
        }else{
            response.sendRedirect("registerFailed.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    boolean checkUser(UserBean user){
        UserDAO ud=new UserDAO();
        if( ud.insertUser(user) ) { return true;
        }
        return false;
    }
}
