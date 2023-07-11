import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("org.sqlite.JDBC");
    Connection connection = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
    PreparedStatement preparedStatement = connection.prepareStatement("select * from students where roll = ?");
    int rollNo = 2;
    preparedStatement.setInt(1, rollNo);
    ResultSet resultSet = preparedStatement.executeQuery();

    while(resultSet.next()){
      System.out.print(resultSet.getInt("roll")+ "  ");
      System.out.print(resultSet.getString("name")+" ");
      System.out.print(resultSet.getInt("deptno")+ " ");
    }
  }
}
