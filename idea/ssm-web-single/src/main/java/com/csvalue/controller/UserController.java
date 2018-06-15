package com.csvalue.controller;

import com.csvalue.model.User;
import com.csvalue.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @ResponseBody
    @RequestMapping("/query")
    public String queryUserList(){
        List<User> userList=iUserService.queryUserList();
        for(User user:userList){
            System.out.println("out=>"+user.toString());
        }
        return "hello springmvc";
    }
}
