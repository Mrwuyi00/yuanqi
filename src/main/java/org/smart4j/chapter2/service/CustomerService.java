package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.util.PropsUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by linwu on 12/22/2017.
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);


    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword){
        try{
            String sql = "SELECT * FROM customer";
            return DatabaseHelper.queryEntityList(Customer.class, sql);
        }finally {
            DatabaseHelper.closeConnection();
        }
    }

    /**
     * 获取客户订单信息
     * @return
     */
    public List<Map<String, Object>> getCustomerOrderInfo(String keyWord){
        try{
            String sql = "select c.name, c.telephone, p.name, p.price from customer_order o " +
                    "inner join customer c on o.customer_id = c.id " +
                    "inner join product p on o.product_id = p.id " +
                    "where o.customer_id = ?";
            return DatabaseHelper.executeQuery(sql, keyWord);
        }finally {
            DatabaseHelper.closeConnection();
        }
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomerById(long id){
        try{
            String sql = "SELECT * FROM customer Where id = ?";
            return DatabaseHelper.queryEntity(Customer.class, sql, id);
        }finally {
            DatabaseHelper.closeConnection();
        }
    }

    /**
     * 创建用户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * 更新用户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id){
        //TODO
        return false;
    }


}
