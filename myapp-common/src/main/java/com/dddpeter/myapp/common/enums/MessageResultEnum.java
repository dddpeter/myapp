package com.dddpeter.myapp.common.enums;

/**
 * Created by lijinde on 2016-4-29.
 */
public enum MessageResultEnum {
    success("交易成功"),
    error("交易失败");
    private String desc;
    public String  getDesc(){
        return desc;
    }
    MessageResultEnum(String desc){
       this.desc=desc;
    }

}
