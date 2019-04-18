package cn.Dbutils.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCutil {
    // 获取c3p0连接池对象,此处文件名也可以不写，默认配置.
    private static ComboPooledDataSource ds = new ComboPooledDataSource("c3p0-config.xml");

    // 获取数据库连接对象
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    // 获取c3p0连接池对象
    public static DataSource getDataSource(){
        return ds;
    }

    // 创建queryRunner对象，用来操作sql语句
    public static QueryRunner getQR(){
        return new QueryRunner(getDataSource());
    }
}
