BigDecimal
    ��飺
        �����Գ���16λ��Чλ�������и߾��ȵ����㡣
    Whyʹ��BigDecima��
        ��Ϊdouble���������ܻ����
    ���ʹ��BigDecima��
        1.ʵ����
            1.new BigDecimal(double) �����Ȼᶪʧ����������
            2.new BigDecimal(String) �����ȱ����������֡�
        2.���÷���  
            1.���þ���setScale
            2.ת����BigDecima����valueOf
        3.���㣺ʹ����߾���  
            BigDecimal a = new BigDecimal("4.50");
            BigDecimal b = new BigDecimal("1.5");
            1. + ��a.add(b)
            2. - ��a.subtract(b)
            3. * ��a.multiply(b)
            4. / ��a.divide(b)  ��������ʱ��������þ��Ⱥͱ������ȵ�ģʽ
            
        