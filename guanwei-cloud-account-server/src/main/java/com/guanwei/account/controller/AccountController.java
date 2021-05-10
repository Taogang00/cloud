package com.guanwei.account.controller;

import com.guanwei.account.client.ResultData;
import com.guanwei.account.client.ThirdFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class AccountController {

    private final ThirdFeignClient thirdFeignClient;

    @GetMapping("/1")
    public ResultData getMsg1() {
        return thirdFeignClient.getSentences();
    }

    @GetMapping("/2")
    public  ResultData getMsg2() {
        return thirdFeignClient.getPoetryFull(2, 1);
    }

}
