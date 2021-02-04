package cn.edu.zjut.dao;

import cn.edu.zjut.po.Customer;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface ICustomerDAO {
//    public void save();
    public int  save(Customer customer);
}
