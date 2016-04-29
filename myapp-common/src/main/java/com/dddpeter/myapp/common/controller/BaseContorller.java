package com.dddpeter.myapp.common.controller;

import com.dddpeter.myapp.common.ResultMessage;

import javax.annotation.Resource;

/**
 * Created by lijinde on 2016-4-29.
 */
public class BaseContorller {
    @Resource(name="resultMessage")
    protected ResultMessage resultMessage;
}
