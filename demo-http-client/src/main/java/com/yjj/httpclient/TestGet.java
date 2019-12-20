package com.yjj.httpclient;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Yin JunJie
 * @Date: 2019/12/20 16:27
 * @Description:
 */
public class TestGet {
    /**
     * 使用帮助类HttpClients创建CloseableHttpClient对象.
     * 基于要发送的HTTP请求类型创建HttpGet或者HttpPost实例.
     * 使用addHeader方法添加请求头部,诸如User-Agent, Accept-Encoding等参数.
     * 可调用HttpGet、HttpPost共同的setParams(HetpParams params)方法来添加请求参数；对于HttpPost对象而言，也可调用setEntity(HttpEntity entity)方法来设置请求参数。
     * 通过执行此HttpGet或者HttpPost请求获取CloseableHttpResponse实例
     * 从此CloseableHttpResponse实例中获取状态码,错误信息,以及响应页面等等.
     * 释放连接。无论执行方法是否成功，都必须释放连接
     */
    public static void main(String[] args) {
//       GetUtils.get("http://localhost:8090/test/get");
        Map map=new HashMap();
        map.put("id","1");
        map.put("name","ss");
       GetUtils.getWithParams("http://localhost:8090/test/get",map);
    }
}
