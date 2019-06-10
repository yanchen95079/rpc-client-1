package com.yc.rpcclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig {

    @Bean(name="proxyClient")
    public RpcProxyClient proxyClient(){
        return new RpcProxyClient();
    }
}
