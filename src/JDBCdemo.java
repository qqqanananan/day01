import com.mysql.cj.jdbc.Driver;

import java.sql.*;

/**
 * @author:ap
 **/
public class JDBCdemo {

    public static void main(String[] args) throws Exception{
        // 1.注册驱动
        //Class.forName("com.mysql.jdbc.Driver");//可省略

        //2.获得链接
        String url = "jdbc:mysql://127.0.0.1:3306/book";//数据库名称
        String username="book";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            //开事务
            connection.setAutoCommit(false);
            //定义sql
            String sql = "select id,name,type,description from tbl_book where id=11";
            //获取执行sql的对象Statement
            statement = connection.createStatement();
            //执行sql
            resultSet = statement.executeQuery(sql);

            while (resultSet.next())
            {
                System.out.println(resultSet.getRow());
            }
            //提交
            connection.commit();
        } catch (Exception e) {

            //回滚事务
            connection.rollback();
            e.printStackTrace();
        }

        resultSet.close();
        statement.close();

    }
}
