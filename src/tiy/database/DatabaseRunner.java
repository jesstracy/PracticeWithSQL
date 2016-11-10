package tiy.database;

import org.h2.tools.Server;
import java.sql.SQLException;

/**
 * Created by jessicatracy on 11/9/16.
 */
public class DatabaseRunner {
    public static void main(String[] args) throws SQLException {
        Server.createWebServer().start();
    }
}
