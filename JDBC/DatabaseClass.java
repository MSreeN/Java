package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseClass {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    Class.forName("org.sqlite.JDBC");
    Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
    java.sql.Statement statement = con.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from dept");

    int deptNo;
    String deptName;
    while(resultSet.next()){
      deptNo = resultSet.getInt("deptno");
      deptName = resultSet.getString("dname");
      System.out.println(deptNo+ "-----"+ deptName);
    }


    /////////////Executing dml query/////////////////

    // Class.forName("org.sqlite.JDBC");
    // Connection connection = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
    // Statement statement = connection.createStatement();
    // ResultSet resultSet = statement.executeQuery("insert into dept values(60, 'Chem')");

    // statement.close();
    // connection.close();
  }
}