package highlevel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbUtil {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/imooc";
    public static final String USER = "clarence";
    public static final String PASSWORD = "123456";

    public static void main(String[] args) throws Exception {
        // 1. 加载驱动程序
        Class.forName(DbUtil.DRIVER);
        // 2. 获得数据库连接
        Connection conn = DriverManager.getConnection(DbUtil.URL, DbUtil.USER, DbUtil.PASSWORD);
        // 3. 操作数据库，实现增删改查
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select user_name, age from imooc_gooddess");
        // 如果有数据rs.next()返回true
        while(rs.next()){
            System.out.println(rs.getString("username") + " 年龄: " + rs.getInt("age"));
        }
    }
}

































