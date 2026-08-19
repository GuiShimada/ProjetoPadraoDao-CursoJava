package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            Properties properties = getProperties();
            String dataBaseURL = properties.getProperty("dburl");
            try {
                connection = DriverManager.getConnection(dataBaseURL, properties);
            }
            catch (SQLException erro) {
                System.out.println(erro.getMessage());
                erro.printStackTrace();
            }
        }
        return connection;
    }

    private static Properties getProperties() {
        Properties properties = new Properties();
        try (FileInputStream src = new FileInputStream("db.properties")) {
            properties.load(src);
        }
        catch (IOException erro) {
            System.out.println(erro.getMessage());
            erro.printStackTrace();
        }
        return properties;
    }

    public void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            }
            catch (SQLException erro) {
                System.out.println(erro.getMessage());
                erro.printStackTrace();
            }
        }
    }
}
