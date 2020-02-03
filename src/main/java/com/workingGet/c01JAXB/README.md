# j2seStudy
简介：
    JAXB（Java Architecture for XML Binding) 是一个业界的标准，是一项可以根据XML Schema产生Java类的技术。
    JAXB提供了快速而简便的方法将XML模式绑定到Java表示，从而使得Java开发者在Java应用程序中能方便地结合XML数据和处理函数。
使用
    JAVA实体类和xml文件对应
    jdk1.7之前的版本使用：         
    jdk1.7开始之后使用：
        JAXB就对解组和编组的方法进行了更简单的封装，所以实际项目中除非自己要进行个性化设置，否则大可不用自己再创建JAXBContext实例，
        直接通过JAXB静态调用相应的工具方法就行了，于是上面的测试方法可以写的更简练些：
解释
    常用注解：
        @XmlRootElement：
            作用和用法：
                类级别的注解。将类映射为xml根元素。
                @XmlRootElement(name = "human")则xml文件的根为<person></person>，默认为类名首字母小写
        @XmlElement
            作用和用法：
                字段、get/set方法级别的注解。该注解可以将被注解的字段(非静态)，或者被注解的get/set方法对应的字段映射为本地元素，也就是xml子元素。
            该注解的属性常用的属性有有：name、nillable、required、namespace、defaultValue
                * name属性可以指定生成元素的名字，同@XmlRootElement注解的name属性一样，不再举例。
                * nillable属性可以指定元素的文本值是否可以为空，默认为false。
                * required属性可以指定该元素是否必须出现，默认为false
                * namespace属性可以指定该元素所属的命名空间
                * defaultValue属性可以指定该元素默认的文本值
        @XmlAttribute   
            作用和用法：
                字段、get/set方法级别的注解。
                该注解可以将被注解的字段(非静态)，或者被注解的get/set方法对应的字段映射为xml根元素的属性，属性名默认使用字段名或get/set方法去掉前缀剩下部分首字母小写(在字段名和get/set方法符合命名规范的情况下)。
        @XmlTransient
            作用和用法：
                字段、get/set方法级别的注解。  
                JAXB在映射类为xml文件时，忽略此字段。需要注意的是该注解与所有其他JAXB注释相互排斥，也就是说与其他注释连用就会报错。
        @XmlAccessorType
            作用和用法：
                类级别的注解。该注解只有一个value属性，可取的值是一个名为XmlAccessType的枚举类型里的值。
                类的字段映射规则，比较复杂，先不用这个
        @XmlAccessorOrder
            作用和用法：
                类级别的注解。控制生成xml文件子元素的顺序。只有一个value属性，可取的值是一个名为XmlAccessOrder的枚举类型的两个值
                XmlAccessOrder.ALPHABETICAL
                    按照字母表的顺序对生成的元素排序。
                XmlAccessOrder.UNDEFINED
                    默认值，按照类中字段的顺序生成元素的顺序。但奇怪的是，只有jaxb按照field生成元素时，默认值才会生效，否则总是按照字母表的顺序排序。
        @XmlJavaTypeAdapter
            作用和用法：
                类、字段，方法级别的注解。解决java日期(Date)，数字(Number)格式化问题。
                日期字段映射到xml中，默认格式为：Date的格式
                @XmlJavaTypeAdapter(自己写的适配器.class)        
                适配器，需要继承XmlAdapter<String, Date> 类，实现marshal和unmarshal方法
                    栗子：
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
                          
                
                
        