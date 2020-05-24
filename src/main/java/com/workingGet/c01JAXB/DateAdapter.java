package com.workingGet.c01JAXB;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: GaoXu
 * @date: 2020/5/24
 * @desc：请对类进行描述
 */
public class DateAdapter extends XmlAdapter<String, Date> {
    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date unmarshal(String date) throws Exception {
        return SDF.parse(date);
    }

    @Override
    public String marshal(Date date) throws Exception {
        return SDF.format(date);
    }
}
