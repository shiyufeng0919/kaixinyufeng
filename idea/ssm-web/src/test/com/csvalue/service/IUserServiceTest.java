package com.csvalue.service;

import com.csvalue.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/spring-*.xml")
public class IUserServiceTest {

    @Autowired
    private  IUserService iUserService;

    @Test
    public void queryUserList() {
        List<User> userList=iUserService.queryUserList();
        for(User user:userList){
            System.out.println("out=>"+user.toString());
        }
    }
}