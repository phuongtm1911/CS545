package com.phoenix.ecommerce;

import com.phoenix.ecommerce.service.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class EcommerceApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    EmailService emailService;

    @Test
    public void testSendEmail()
    {
        emailService.sendEmail("mtran@mum.edu", "Cart - Test Mail", "This is a test email from Cart");
    }

}
