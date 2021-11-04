//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.zjh.gulimall.thirdparty.controller;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import com.zjh.common.utils.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OssContorller {
    @Resource
    OSS ossClient;
    @Value("${spring.cloud.alicloud.oss.endpoint}")
    private String endpoint;
    @Value("${spring.cloud.alicloud.oss.bucket}")
    private String bucket;
    @Value("${spring.cloud.alicloud.access-key}")
    private String accessId;
    @Value("${spring.cloud.alicloud.secret-key}")
    private String accessKey;
    private Map<String, String> respMap = null;

    public OssContorller() {
    }

    @RequestMapping({"/oss/policy"})
    public R policy() {
        String host = "https://" + this.bucket + "." + this.endpoint;
        String format = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
        String dir = format + "/";
        this.ossClient = (new OSSClientBuilder()).build(this.endpoint, this.accessId, this.accessKey);

        try {
            long expireTime = 30L;
            long expireEndTime = System.currentTimeMillis() + expireTime * 1000L;
            Date expiration = new Date(expireEndTime);
            PolicyConditions policyConds = new PolicyConditions();
            policyConds.addConditionItem("content-length-range", 0L, 1048576000L);
            policyConds.addConditionItem(MatchMode.StartWith, "key", dir);
            String postPolicy = this.ossClient.generatePostPolicy(expiration, policyConds);
            byte[] binaryData = postPolicy.getBytes("utf-8");
            String encodedPolicy = BinaryUtil.toBase64String(binaryData);
            String postSignature = this.ossClient.calculatePostSignature(postPolicy);
            this.respMap = new LinkedHashMap();
            this.respMap.put("accessid", this.accessId);
            this.respMap.put("policy", encodedPolicy);
            this.respMap.put("signature", postSignature);
            this.respMap.put("dir", dir);
            this.respMap.put("host", host);
            this.respMap.put("expire", String.valueOf(expireEndTime / 1000L));
        } catch (Exception var17) {
            System.out.println(var17.getMessage());
        } finally {
            this.ossClient.shutdown();
        }

        return R.ok().put("data", this.respMap);
    }
}
