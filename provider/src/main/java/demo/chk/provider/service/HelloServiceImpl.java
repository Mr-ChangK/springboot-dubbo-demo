package demo.chk.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import demo.chk.api.HelloService;
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
