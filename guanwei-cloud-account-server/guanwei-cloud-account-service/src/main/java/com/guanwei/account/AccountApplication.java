package com.guanwei.account;

import com.guanwei.account.config.AccountClientConfig;
import com.guanwei.order.config.OrderClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {OrderClientConfig.SERVICE_PACKAGE, AccountClientConfig.SERVICE_PACKAGE})
@EnableDiscoveryClient
@SpringBootApplication
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}
