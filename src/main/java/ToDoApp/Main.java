
package ToDoApp;

import java.sql.Connection;
import util.Conexao;

/**
 *
 * @author renata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection c = Conexao.getConexao();
        
        Conexao.closeConnection(c);
        
    }
    
}
