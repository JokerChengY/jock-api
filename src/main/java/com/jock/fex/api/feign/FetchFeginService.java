package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "fetchmgr")
@Component(value = "feignDataService")
public interface FetchFeginService {
		@RequestMapping(value="/dailyData/inline/public/selectDailyData")
		public BaseResp<Object> selectDailyData(@RequestParam("t") String t,
                                                @RequestParam("s") String s);
}
