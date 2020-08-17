package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    Connection c = null;
    Statement stmt = null;

    public DB() {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "J3*6pw&B");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        System.out.println("Opened database successfully");
    }

    public void insert(WorkingNote note) {
        try {
            stmt = c.createStatement();
            String sql = "INSERT INTO Notes (Header, Body, Tags) VALUES ('" + note.getHeader() + "', '" + note.getBody() + "', '" + note.getTags() + "');";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
   }

   public void select(){
        String header = " ", body = " ", tags = " ";

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Notes;");

            while (rs.next()){
                header = rs.getString("Header");
                body = rs.getString("Body");
                tags = rs.getString("Tags");
                System.out.println(header + "\n" + body + "\n" + tags);
            }
            rs.close();
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
   }
}