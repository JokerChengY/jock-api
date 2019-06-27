package com.jock.fex.api.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(value = "jock-order")
@Component(value = "jockOrderUploadService")

public interface OrderFeginService {

    /**
     * 根据id查询记录
     *
     * @param id id
     * @return 记录
     */
    @GetMapping("/order/{id}")
    String get(@PathVariable(value = "id") Long id);

    /**
     * 查询所有记录
     *
     * @return 所有记录
     */
    @GetMapping("/order/list")
    String list();

    /**
     * 添加一个记录
     *
     * @param dto 参数
     * @return 是否成功
     */
    @PostMapping("/order/add")
    String add(@RequestParam Map<String, Object> map);
}
