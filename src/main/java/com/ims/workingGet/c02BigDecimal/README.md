BigDecimal
    简介：
        用来对超过16位有效位的数进行高精度的运算。
    Why使用BigDecima？
        因为double间的运算可能会出错
    如何使用BigDecima？
        1.实例化
            1.new BigDecimal(double) ：精度会丢失，不用这种
            2.new BigDecimal(String) ：精度保留，用这种。
        2.常用方法  
            1.设置精度setScale
            2.转换成BigDecima对象valueOf
        3.运算：使用最高精度  
            BigDecimal a = new BigDecimal("4.50");
            BigDecimal b = new BigDecimal("1.5");
            1. + ：a.add(b)
            2. - ：a.subtract(b)
            3. * ：a.multiply(b)
            4. / ：a.divide(b)  除不尽的时候必须设置精度和保留精度的模式
            
        