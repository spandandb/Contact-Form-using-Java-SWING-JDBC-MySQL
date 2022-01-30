package jdbctryfirst;

import java.sql.*;

class jdbsConnection {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/firstsql", "root", "spandandb94");
        Statement statement = connection.createStatement();
        String getdata = "SELECT * FROM funny";
        ResultSet rs = statement.executeQuery(getdata);
        while (rs.next()) {
            System.out.print("SERIAL NO.: " + rs.getInt(1));
            System.out.print(", First Name: " + rs.getString(2));
            System.out.print(", Last Name: " + rs.getString(3));
            System.out.print(", Company Name: " + rs.getString(4));
            System.out.println(", Nation: " + rs.getString(5) + "\n \n");
        }
        connection.close();
    }
}
