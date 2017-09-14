package demo.chk.consumer.controller;

import demo.chk.consumer.service.HelloServiceRpc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private HelloServiceRpc helloServiceRpc;
    @GetMapping("/hello")
    public String Hello(String name) {
        return helloServiceRpc.sayHelloRpc(name);
    }
}
