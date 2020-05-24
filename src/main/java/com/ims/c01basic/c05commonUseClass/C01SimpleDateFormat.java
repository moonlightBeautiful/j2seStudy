package com.ims.c01basic.c05commonUseClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C01SimpleDateFormat {

    public static void main(String[] args) throws ParseException {
       /* Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // yyyy-MM-dd  yyyy年MM月dd日 HH时mm分ss秒
        System.out.println(sdf.format(date));
*/

        String dateStr = "1989-11-02 10:04:07";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf2.parse(dateStr));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
