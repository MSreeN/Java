import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        // Class.forName("org.sqlite.JDBC");
        // Connection connection = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        // Statement statement = connection.createStatement();
        // ResultSet resultSet = statement.executeQuery("select * from dept");
        // while (resultSet.next()) {
        //     System.out.print(resultSet.getInt("deptNo") + " ");
        //     System.out.println(resultSet.getString("dname"));
        // }

        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        Statement statement = connection.createStatement();
        statement.executeUpdate("insert into dept values(50,'Petroleum')");

        //////////closing connections////////////////

        connection.close();
        statement.close();
    }
}
