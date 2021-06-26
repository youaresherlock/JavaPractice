package foundation;

//public class Employee {
//    //静态的私有变量
//    private static double salary;
//    // public static final修饰使用大写字母
//    public static final String DEPARTMENT = "开发人员";
//
//    public static void main(String[] args){
//        Employee.salary = 10000;
//        System.out.println(Employee.DEPARTMENT + "平均工资: " + Employee.salary);
//    }
//}

public class Employee implements java.io.Serializable
{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
