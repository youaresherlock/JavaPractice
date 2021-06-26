package highlevel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/db3";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "123456";

    public static void main(String[] args) throws Exception {
        // jdbc的使用
        // 1. 导入驱动jar包
        // 2. 注册驱动
        Class.forName(JdbcDemo.DRIVER);
        // 3. 获取数据库连接对象
        Connection conn = DriverManager.getConnection(JdbcDemo.URL, JdbcDemo.USERNAME, JdbcDemo.PASSWORD);
        // 4. 定义sql语句
        String sql = "update account set balance = 500 where id = 1";
        // 5. 获取执行sql语句的对象 Statement
        Statement stmt = conn.createStatement();
        // 6. 执行sql
        int count = stmt.executeUpdate(sql);
        // 7. 处理结果
        System.out.println(count);
        // 8. 释放结果
        stmt.close();
        conn.close();
    }
}

























