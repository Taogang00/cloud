package com.guanwei.account.client.impl;

import com.guanwei.account.client.AccountFeignClient;
import com.guanwei.account.config.AccountClientConfig;
import com.guanwei.account.dto.AccountDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(AccountClientConfig.ACCOUNT_CLIENT_PATH)
public class AccountFeignClientImpl implements AccountFeignClient {

    @Override
    public AccountDTO get(String id) {
        log.info("get message:{}", id);
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setId("1");
        accountDTO.setName("admin");
        accountDTO.setMoney(10.99);
        return accountDTO;
    }
}
