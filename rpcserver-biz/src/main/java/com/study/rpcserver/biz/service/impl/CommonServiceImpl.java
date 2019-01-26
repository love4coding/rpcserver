/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.study.rpcserver.biz.service.impl;

import com.study.rpcserver.api.CommonService;
import org.springframework.stereotype.Service;

/**
 * 测试服务
 * @author yalinli
 * @version $Id: CommonServiceImpl.java, v 0.1 2018-12-10 21:09 yalinli Exp $$
 */
@Service("commonService")
public class CommonServiceImpl implements CommonService {

    @Override
    public String hello(String name) {
        return "HELLO FROM SERVER: " + name;
    }
}
