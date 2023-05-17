package com.nsu.common;

import java.util.UUID;

public class IDCommon {

    // 生成（创建）id
    public static String createID(){
        return UUID.randomUUID().toString()
                .replace("-","");
    }
}
