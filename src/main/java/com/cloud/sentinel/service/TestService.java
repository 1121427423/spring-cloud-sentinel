package com.cloud.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author hspcadmin
 */
@Service
public class TestService {

    /**
     * @SentinelResource 注解用来标识资源是否被限流、降级。例子上该注解的属性 sayHello 表示资源名。
     * https://github.com/alibaba/Sentinel/wiki/%E6%B3%A8%E8%A7%A3%E6%94%AF%E6%8C%81
     * 注：一般推荐将 @SentinelResource 注解加到服务实现上，而在 Web 层直接使用 Spring Cloud Alibaba
     * 自带的 Web 埋点适配。Sentinel Web 适配同样支持配置自定义流控处理逻辑，参考 相关文档
     * @param name
     * @return
     */
    @SentinelResource(value = "sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
