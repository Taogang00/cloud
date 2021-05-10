package com.guanwei.account.client;

import com.guanwei.account.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static com.guanwei.account.config.AccountClientConfig.*;

@FeignClient(value = SERVICE_NAME, contextId = ACCOUNT_CLIENT, path = SERVICE_URI_PREFIX + ACCOUNT_CLIENT_PATH)
public interface AccountFeignClient {

    @GetMapping("/{id}")
    AccountDTO get(@PathVariable("id") String id);
}
