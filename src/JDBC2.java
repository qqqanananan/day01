import org.junit.Test;

import java.sql.*;

/**
 * @author:ap
 **/
public class JDBC2 {
    @Test
    public void test() throws SQLException {
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
