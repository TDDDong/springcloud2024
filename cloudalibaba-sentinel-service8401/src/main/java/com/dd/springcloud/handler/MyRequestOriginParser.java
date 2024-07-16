package com.dd.springcloud.handler;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component
public class MyRequestOriginParser implements RequestOriginParser {
    /**
     * sentinel授权规则相关内容 请求url中携带serverName参数 且参数值为sentinel中配置的值时 进行限流
     */
    @Override
    public String parseOrigin(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getParameter("serverName");
    }
}
