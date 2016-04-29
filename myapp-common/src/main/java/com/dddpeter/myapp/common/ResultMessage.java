package com.dddpeter.myapp.common;

import com.dddpeter.myapp.common.enums.MessageResultEnum;

/**
 * Created by lijinde on 2016-4-29.
 */
public interface ResultMessage {
    String getMessage();
    void setMessage(String message);
    Object getResultContent();
    void setResultContent(Object resultContent);
    MessageResultEnum getResultCode();
    void setResultCode(MessageResultEnum resultCode);

}
