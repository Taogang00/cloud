package com.guanwei.account.controller;

import com.guanwei.account.client.ResultData;
import com.guanwei.account.client.ThirdFeignClient;
import com.guanwei.order.client.OrderFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AccountController {

    private final OrderFeignClient feignClient;

    private final ThirdFeignClient thirdFeignClient;

    public AccountController(OrderFeignClient feignClient, ThirdFeignClient thirdFeignClient) {
        this.feignClient = feignClient;
        this.thirdFeignClient = thirdFeignClient;
    }

    @GetMapping("/1")
    public String getMsg() {
        return feignClient.get("11").toString();
    }

    @GetMapping("/2")
    public ResultData getMsg2() {
        return thirdFeignClient.getSentences();
    }

    @GetMapping("/3")
    public  ResultData getMsg3() {
        return thirdFeignClient.getPoetryFull(2, 1);
    }

}
