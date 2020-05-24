# j2seStudy
简介：
    JAXB将Java对象与XML进行转换。
JAXB常用注解：
    类上：
        @XmlRootElement：将类映射为xml根元素。
            name属性：指定根节点名，不指定默认类名首字母小写
            namespace属性：命名空间
        @XmlAccessorType：类中的何种类型属性需要映射为xml子元素
            XmlAccessType.PUBLIC_MEMBER：将这个类中的所有public的field或property同时映射到XML（默认）
            XmlAccessType.FIELD：映射这个类中的所有字段到XML
            XmlAccessType.PROPERTY：映射这个类中的属性（get/set方法）到XML
            XmlAccessType.NONE：不映射
        @XmlAccessorOrder：生成xml文件子节点的顺序
            XmlAccessOrder.ALPHABETICAL：按照字母表的顺序对生成的元素排序。
            XmlAccessOrder.UNDEFINED：默认值，按照类中字段的顺序生成元素的顺序。只有jaxb按照field生成元素时，默认值才会生效，否则总是按照字母表的顺序排序。
    属性上
        @XmlElement：将被注解的属性(非静态)映射为xml子元素。
            name属性：指定节点名，不指定默认属性名首字母小写
            namespace属性：节点命名空间
            nillable属性：是否处理空数据，默认为false
            required属性：该节点是否必须出现，默认为false
            defaultValue属性：可以指定该元素默认的文本值
        @XmlTransient：忽略此字段的映射  
            该注解没有属性。
            该注解与所有其他JAXB注释相互排斥。
        @XmlAttribute：将被注解的属性(非静态)映射为xml根元素的属性，
            name属性：指定根节点属性名，不指定默认首字母小写
            required属性：属性必须存在
        @XmlJavaTypeAdapter(自己写的适配器.class)：格式化日期(Date)。日期字段映射到xml中，默认格式为：Date的格式   
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
    属性xml类型
        1.基本属性  
            可以作为节点属性或者子节点
        2.javabean属性
            javabean生成xml节点，然后作为类xml的子节点
        3.集合属性|Map属性+基本属性  
        4.集合属性|Map属性+javabean属性 
         
        