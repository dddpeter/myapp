package com.dddpeter.myapp.common.impl;

import com.dddpeter.myapp.common.ResultMessage;
import com.dddpeter.myapp.common.enums.MessageResultEnum;
import org.springframework.stereotype.Component;

/**
 * Created by lijinde on 2016-4-29.
 */
@Component("resultMessage")
public class ResultMessageImpl implements ResultMessage {
    MessageResultEnum resultCode=MessageResultEnum.success;
    String message="";
    Object resultContent=new Object();
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResultContent() {
        return resultContent;
    }

    public void setResultContent(Object resultContent) {
        this.resultContent = resultContent;
    }


    public MessageResultEnum getResultCode() {
        return resultCode;
    }

    public void setResultCode(MessageResultEnum resultCode) {
        this.resultCode = resultCode;
    }




}
