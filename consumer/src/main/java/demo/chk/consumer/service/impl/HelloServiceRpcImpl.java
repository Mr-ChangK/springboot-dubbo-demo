package demo.chk.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import demo.chk.api.HelloService;
import demo.chk.consumer.service.HelloServiceRpc;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceRpcImpl implements HelloServiceRpc{
    @Reference
    private HelloService helloService;
    @Override
    public String sayHelloRpc(String name) {
        return helloService.sayHello(name);
    }
}
