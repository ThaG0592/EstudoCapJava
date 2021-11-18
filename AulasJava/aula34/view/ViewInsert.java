package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewInsert{
    public static void main(String[] args) {
        try {
            //SQL
            String nome = "Eletro'); detete from categoria; INSERT INTO produto(nome)values('otario')";
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","123456");
            
         
            PreparedStatement prepSstatement = conn.prepareStatement("INSERT INTO produto(nome)values(?)");
            prepSstatement.setString(1, nome);
         
            prepSstatement.execute();
            ResultSet ids = prepSstatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);
            }
            conn.close();
        
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}