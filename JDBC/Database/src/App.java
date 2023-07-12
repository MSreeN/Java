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

        ///////////insertion////////////////
        // statement.executeUpdate("insert into dept values(50,'Petroleum')");

        //////////////deletion from table///////////
        // statement.executeUpdate("delete from dept where deptno>50");

        //////////updating//////////////

        // statement.executeUpdate("update dept set dname = 'Chem' where deptno = 50");


        //////////////creation of table///////////////

        // statement.executeUpdate("create table Temp(a integer, b integer)");

        /////////////dropping table//////////////////

        statement.executeUpdate("drop table Temp");

        //////////closing connections////////////////

        connection.close();
        statement.close();
    }
}
