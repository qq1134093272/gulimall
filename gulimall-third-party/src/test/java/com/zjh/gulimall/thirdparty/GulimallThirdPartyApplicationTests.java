package com.zjh.gulimall.thirdparty;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@EnableDiscoveryClient
@SpringBootTest
public class GulimallThirdPartyApplicationTests {
    @Resource
    OSS ossClient;
    @Test
    public void contextLoads() throws FileNotFoundException {
//        String bucketName = "gulimall-yep";
//        // <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
//        String objectName = "E:\\Java Project\\pic\\log.txt";
//
//        // 上传文件到指定的存储空间（bucketName）并将其保存为指定的文件名称（objectName）。
//// 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
        InputStream inputStream = new FileInputStream("E:\\Java Project\\pic\\log.txt");
        ossClient=new OSSClientBuilder().build("oss-cn-beijing.aliyuncs.com",
                "LTAI5tMqGXGJoVehZLdYrbZD", "Xu2h6Nu2PRNXUUDoejhqIEe2sVFnQG");
//// 依次填写Bucket名称（例如examplebucket）和Object完整路径（例如exampledir/exampleobject.txt）。Object完整路径中不能包含Bucket名称。
        ossClient.putObject("gulimall-yep", "pic/log4.txt", inputStream);
//
        // 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("testUploadByCloudAlibabaOSS done");
    }

}
