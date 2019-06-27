package com.jock.fex.api.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "jock-user")
@Component(value = "jockUserUploadService")
@RequestMapping("/user")
public interface UserService {

}
