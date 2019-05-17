package com.xin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhaoxin
 * @create 2019-05-13 15:38
 * @desc
 **/
@RestController
public class TestController {

    @RequestMapping("getDate")
    @ResponseBody
    public String getNow() {
        Date d = DateUtil.getDate();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String res = DateUtil.getName();

        User u = new User();
        u.setAge(15);

        System.out.println(DateUtil.pringTimeStampYMDHms());
        return "当前时间：" +  sm.format(d);
    }
}
