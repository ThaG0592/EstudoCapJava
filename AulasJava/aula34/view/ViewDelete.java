package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewDelete {
    public static void main(String[] args) {
        try {
            int idDeletado = 26;

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "123456");
            
            String sql = "DELETE FROM pessoa WHERE id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setInt(1, idDeletado);
            
            prepStatement.execute(sql);   
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);         
            

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
