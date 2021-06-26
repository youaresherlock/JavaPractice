package highlevel;

import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;

import java.lang.annotation.*;

/*自定义的Annotation*/
// 指定类型属性, 修饰类、接口或枚举声明
@Target(ElementType.TYPE)
// 指定策略属性, 编译器会将Annotation信息保留在.class文件中,并且能被虚拟机读取
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface Inheritable{

}


@Inheritable
class InheritableFather
{
    public InheritableFather() {
        // InheritableBase是否具有 Inheritable Annotation
        System.out.println("InheritableFather:"+InheritableFather.class.isAnnotationPresent(Inheritable.class));
    }
}

/**
 * InheritableSon 类只是继承于 InheritableFather，
 */
public class InheritableSon extends InheritableFather
{
    public InheritableSon() {
        super();    // 调用父类的构造函数
        // InheritableSon类是否具有 Inheritable Annotation
        System.out.println("InheritableSon:"+InheritableSon.class.isAnnotationPresent(Inheritable.class));
    }

    public static void main(String[] args)
    {
        InheritableSon is = new InheritableSon();
    }
}








































































