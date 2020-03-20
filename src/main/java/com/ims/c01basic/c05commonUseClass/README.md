# j2seStudy
常用的类
    日期处理类
        Date：标准日期类，这个类好多方法和属性都过时了。
            输出格式不适合人类阅读
        Calendar：日历类，取代Date
            不能直接实例化，要使用Calendar calendar=Calendar.getInstance();
        SimpleDateFormat：日期格式化类
            字符串转日期：parse(dateStr)
            日期转字符串：format(date)
            年yyyy 月MM 日dd 时HH 分mm 秒ss
    字符串类：
        堆分为公共堆和私有堆
        String类：对其对象操作，相当于重新指向新的内容。
        StringBuffer类：对其对象操作，是改变内容空间大小，修改内容。
    数学类:
        Math
    数组类：
        Arrays
            toString(数组)：以字符串形式输出数组
            sort(数组)：对数组进行排序
            binarySearch(数组，值)：搜索值再数组中的index
            fill(数组，值)：把值塞满数组
    