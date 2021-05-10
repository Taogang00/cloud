package com.guanwei.account.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ThirdFeignClient", url = "http://poetry.apiopen.top")
public interface ThirdFeignClient {

    /**
     * 随机一句名言
     *
     * @return com.guanwei.account.client.ResultData
     * @author TaoGang
     * @date 2021/5/8 20:54
     */
    @GetMapping("/sentences")
    ResultData getSentences();

    /**
     * 获取诗词列表-包含作者信息
     *
     * @param count
     * @param page
     * @return com.guanwei.account.client.ResultData
     * @author TaoGang
     * @date 2021/5/8 20:54
     */
    @GetMapping("/poetryFull")
    ResultData getPoetryFull(@RequestParam("count") Integer count, @RequestParam("page") Integer page);
}
