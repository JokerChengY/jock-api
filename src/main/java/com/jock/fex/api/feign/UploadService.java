package com.jock.fex.api.feign;

import com.jock.fex.api.base.BaseResp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "uploadmgr")
@Component(value = "feignUploadService")
public interface UploadService {

	/**
	 * 微信文件上传
	 * 
	 * @param param
	 *            t、s、wxMediaId、type、remotePath
	 * @return
	 */
	@RequestMapping(value = "/upload/file/wx/img", method = RequestMethod.POST)
	public BaseResp<Object> uploadWxImg(@RequestParam("map") Map<String, Object> param);

}
