package com.dddpeter.myapp.user.controller;

import com.dddpeter.myapp.common.ResultMessage;
import com.dddpeter.myapp.common.controller.BaseContorller;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lijinde on 2016-4-29.
 */
@Scope("prototype")
@RestController
@RequestMapping("/user")
public class HelloController extends BaseContorller{
    @RequestMapping(value="/list",method= RequestMethod.GET)
    @ResponseBody
    public ResultMessage getProducts(HttpServletRequest request,HttpServletResponse response) throws Exception {
        Map map=new HashMap();
        map.put("message","HelloWord");
        resultMessage.setMessage("交易成功");
        resultMessage.setResultContent(map);
        return resultMessage;
    }
}
