package cn.edu.zjut.dao;
import java.sql.*;import javax.sql.*;import javax.naming.*; import cn.edu.zjut.model.UserBean;
public class UserDAO{
    private static final String GET_ONE_SQL ="SELECT * FROM usertable WHERE username=? and password=? and type=?";
    public UserDAO( ){ }
    public Connection getConnection() throws ClassNotFoundException {
        Connection conn = null;
        String driver = "org.postgresql.Driver";
        String dburl = "jdbc:postgresql://127.0.0.1:5432/myDB";
        String username = "postgres"; //数据库登录用户名
        String password = "leilei19990610"; //数据库登录密码
        try{
        Class.forName(driver); //加载数据库驱动程序
        conn = DriverManager.getConnection(dburl,username,password);
    }catch( Exception e ){ e.printStackTrace(); }
        return conn;
            }
    public boolean searchUser(UserBean user){
// 按用户名和密码校验用户是否合法
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rst=null;
    try{
        conn = getConnection();
        pstmt = conn.prepareStatement(GET_ONE_SQL);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getPassword());
        if(user.getType().equals("管理员")) {
            pstmt.setInt(3,1);
        } else {
            pstmt.setInt(3,2);
        }
        rst = pstmt.executeQuery();
        if(rst.next()){
            return true;
        }
    }catch(SQLException | ClassNotFoundException se){ se.printStackTrace(); return false; }finally{ try{ pstmt.close(); conn.close();
    }catch(SQLException se){ se.printStackTrace(); }
    } return false;
}
    public boolean insertUser(UserBean user) {
        String sql = "INSERT INTO usertable" + "(username, password, type)VALUES(?,?,?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3, 2);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException se) {
            se.printStackTrace();
            return false;
        }
    }
}
