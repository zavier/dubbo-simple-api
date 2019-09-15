package com.zavier.application.manager.rpc;

import com.zavier.rpc.service.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(version = "0.0.1", timeout = 60000)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Welcome: " + name;
    }
}
