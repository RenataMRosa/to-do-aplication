
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author renata
 */
public class Conexao {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp";
    public static final String USER = "root";
    public static final String PASS = "";
    
    public static Connection getConexao(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex){
            throw new RuntimeException("Erro na conexao com o banco de dados!");
        }
    }
    
    public static void closeConnection(Connection conexao){
        try {
            if(conexao != null)
                conexao.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados");
        }
    }

    public static void closeConnection(Connection conexao, PreparedStatement statement){
        try {
            if(conexao != null)
                conexao.close();
            
            if (statement != null)
                statement.close();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados");
        }
    }   
    
    public static void closeConnection(Connection conexao, PreparedStatement statement, ResultSet resultSet){
        try {
            if(conexao != null)
                conexao.close();
            
            if(statement != null)
                statement.close();
            
            if(resultSet != null)
                resultSet.close();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados");
        }
    } 
    
}
