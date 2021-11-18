package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewUpdate {
    public static void main(String[] args) {

        try {
            String nome = "UpdatePrepStatement";
            int id = 25;
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "123456");
            
            String sql = " UPDATE pessoa SET nome= ? WHERE id = ?";
            PreparedStatement prepareStatement = conn.prepareStatement(sql);    
            prepareStatement.setString(1, nome);    
            prepareStatement.setInt(2, id);      
            prepareStatement.execute();  
                    
            int linhasAfetadas = prepareStatement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
