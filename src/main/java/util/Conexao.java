/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

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
            throw new RuntimeException("Erro ao fechar a conex�o com o banco de dados");
        }
    }    
    
}
