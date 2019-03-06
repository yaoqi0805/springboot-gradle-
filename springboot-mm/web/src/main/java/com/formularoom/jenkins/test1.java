package com.formularoom.jenkins;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/test")
public class test1 {

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    @ResponseBody
    public String test1() {
        return "spring boot multiple modules test";
    }

    //java调用jenkins
    @RequestMapping(value = "/test", method = {RequestMethod.POST})
    @ResponseBody
    public String test() throws Exception {
        URI url1 = new URI("http://172.20.0.93:8080");
        try {
            JenkinsServer jekins = new JenkinsServer(url1, "admin", "admin");
            if (jekins.isRunning()) {
                Map<String, Job> map = jekins.getJobs();
                Map<String, String> param = new HashMap<>();//参数
                param.put("token", "123");//需要job允许远程构建并约定token
                JobWithDetails jobWithDetails = jekins.getJob("OnlineMonitor_ETL_Run-Manual_MonitorInfo");//job名称
                QueueReference queueReference = jobWithDetails.build(param);//执行构建
                //怀疑获取的不是本次执行结果
                BuildResult result = jekins.getJob("OnlineMonitor_ETL_Run-Manual_MonitorInfo").getLastBuild().details().getResult();
                System.out.println(result.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
