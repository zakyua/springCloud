package com.atguigu.SpringCloudTest;

import com.atguigu.springCloud.Entities.Payment;
import com.atguigu.springCloud.PaymentMain8001;
import com.atguigu.springCloud.dao.PaymentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ChenCheng
 * @create 2022-06-20 22:29
 */
@SpringBootTest(classes = PaymentMain8001.class)
public class PaymentTest {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private PaymentDao paymentDao;

    @Test
    public void data() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    void getPayment(){
        Payment payment = paymentDao.getPaymentById(1L);
        System.out.println(payment);
    }

    @Test
    public void insert(){
        Payment payment = new Payment();
        payment.setSerial("周炳宏");
        int result = paymentDao.create(payment);
        System.out.println("受影响的行数");
        Long id = payment.getId();
        System.out.println("插入到数据库后的id"+id);

    }


}
