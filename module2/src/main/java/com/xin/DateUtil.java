package com.xin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/**
 * @author zhaoxin
 * @create 2019-05-13 15:36
 * @desc
 **/
public class DateUtil {

    /**
     * 显示当前时间，精确到秒
     * @return
     */
    public static String pringTimeStampYMDHms() {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(System.currentTimeMillis());
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-M-dd HH:mm:ss", Locale.CHINA);
        String timeStamp = sf.format(c.getTime());
        return timeStamp;
    }

    /**
     *
     * @param dateStr
     * @return
     */
    public static String dataStrToStringTypeYmdhms(String dateStr){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",
                Locale.CHINA);
        Date d;
        String date = "";
        long time = 0 ;
        try {
            d = sdf.parse(dateStr);
            time  = d.getTime();
            date = sdf.format(d);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 生成去掉符号的uuid
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static Date getDate() {
        return new Date();
    }

    public static String getName() {
        return "name";
    }



}
