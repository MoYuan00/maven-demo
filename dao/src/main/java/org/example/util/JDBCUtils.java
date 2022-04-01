package org.example.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 数据库连接工具
 */
public class JDBCUtils {
    private static ComboPooledDataSource dataSource;
    static {
        dataSource = new ComboPooledDataSource();
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static DataSource getDataSource() throws SQLException {
        return dataSource;
    }
}
