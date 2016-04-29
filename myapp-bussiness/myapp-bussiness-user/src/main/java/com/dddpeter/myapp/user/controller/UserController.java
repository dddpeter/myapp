package com.dddpeter.myapp.user.controller;

import com.dddpeter.myapp.common.ResultMessage;
import com.dddpeter.myapp.common.controller.BaseContorller;
import com.dddpeter.myapp.common.enums.MessageResultEnum;
import com.dddpeter.myapp.user.bo.User;
import com.dddpeter.myapp.user.service.UserService;
import com.dddpeter.myapp.user.vo.UserVo;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by lijinde on 2016-4-29.
 */
@Scope("prototype")
@RestController
@RequestMapping("/user")
public class UserController extends BaseContorller {
    @Resource(name="userService")
    UserService userService;
    @RequestMapping(value="/register",method= RequestMethod.POST)
    @ResponseBody
    public ResultMessage userRegister(@RequestBody UserVo user,
                                      HttpSession session){
        if(user!=null){
            if(null!=user.getUserName() && !user.getUserName().trim().equals("") && null!=user.getUserName() && !user.getUserName().trim().equals("")){
                User userMe=new User();
                userMe.setUserName(user.getUserName());
                userMe.setPassword(user.getPassword());
                User u=userService.register(userMe);
                resultMessage.setMessage("注册成功");
                resultMessage.setResultContent(u);
            }
            else{
                resultMessage.setResultCode(MessageResultEnum.error);
                StringBuilder errorMessage=new StringBuilder();
                if(null==user.getUserName() || user.getUserName().trim().equals("")){
                    errorMessage.append("用户名不能为空|");
                }
                else if(null==user.getPassword() || user.getPassword().trim().equals("")){
                    errorMessage.append("密码不能为空");
                }
                resultMessage.setMessage(errorMessage.toString());

            }
        }
        else{
            resultMessage.setResultCode(MessageResultEnum.error);
            resultMessage.setMessage("用户注册信息不能为空");
        }
        return resultMessage;
    }
}
