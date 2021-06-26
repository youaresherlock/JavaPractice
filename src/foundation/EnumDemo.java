package foundation;

//enum Color{
//    RED, GREEN, BLUE;
//}
//
//public class EnumDemo {
//    public static void main(String[] args) {
//        Color c = Color.RED;
//        System.out.println(c);
//
//        //for语句来迭代枚举元素
//        for(Color color: Color.values()){
//            System.out.println(color);
//        }
//    }
//}

enum Color
{
    RED, GREEN, BLUE;

    // 构造函数只能使用private访问修饰符
    private Color(){
        System.out.println("Constructor called for: " + this.toString());
    }

    public void colorInfo(){
        System.out.println("Universal Color");
    }
}

public class EnumDemo
{
    /*
    values() 返回枚举类中所有的值
    ordinal() 找到每个枚举常量的索引
    valueOf() 制定字符串值得枚举常量
     */
    public static void main(String[] args)
    {
        // 调用 values()
        Color[] arr = Color.values();

        // 迭代枚举
        for (Color col : arr)
        {
            // 查看索引
            System.out.println(col + " at index " + col.ordinal());
        }

        // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
    }
}



































