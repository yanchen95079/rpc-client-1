package com.yc.rpcclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class RpcclientApplication {

    public static void main(String[] args) {
        ApplicationContext context=new
                AnnotationConfigApplicationContext(SpringConfig.class);
        RpcProxyClient rpcProxyClient=context.getBean(RpcProxyClient.class);

        /*IHelloService iHelloService=rpcProxyClient.clientProxy
                (IHelloService.class,"localhost",8080);*/

        IService service=rpcProxyClient.clientProxy(IService.class,
                "localhost",8080);

        service.work();
        SpringApplication.run(RpcclientApplication.class, args);
    }

}
