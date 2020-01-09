(1).eval():返回值为Object，可以通过eval()求文本表达式的值或者运行脚本；
    Object o=interpreter.eval(str);
        interpreter.eval("import java.util.*;");//引入util
        interpreter.eval("import com.xxx.function.*;");//引入自己的function包
        interpreter.eval("Test.getName()");//执行Test类的getName()方法
(2).set()：传递对象的变量参数给BeanShell执行的脚本，在脚本中直接使用此变量
    interpreter.set("变量", 值);
        interpreter.set("date", new Date().getTime());
        interpreter.set("now", 10);
        Object object=interpreter.eval("return date*now;");
(3).get()：取得BeanShell中的变量 Object
    脚本中的变量，貌似可以省略声明类型