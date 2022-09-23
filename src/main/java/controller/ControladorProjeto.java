
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Projeto;
import util.Conexao;

/**
 *
 * @author renata
 */
public class ControladorProjeto {
    
    public void salvar(Projeto projeto){
        String sql = "INSERT INTO projetos(nome,"
                + "descricao,"
                + "dataCriacao,"
                + "dataAtualizacao)"
                + "VALUES(?,?,?,?)";
        
        Connection c = null;
        PreparedStatement ps = null;
        
        try {
            c = Conexao.getConexao();
            ps = c.prepareCall(sql);
            ps.setString(1, projeto.getNome());
            ps.setString(2, projeto.getDescricao());
            ps.setDate(3, (new Date(projeto.getDataCriacao().getTime())));
            ps.setDate(4, (new Date(projeto.getDataAtualizacao().getTime())));
            ps.execute();
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao salvar o projeto" + e.getMessage(), e);
        } finally {
            Conexao.closeConnection(c, ps);
        }               
    }
    
    public void atualizar (Projeto projeto){
        String sql = "UPDATE projetos SET "
                + "nome = ?, "
                + "descricao = ?, "
                + "dataCriacao = ?, "
                + "dataAtualizacao = ?"
                + "WHERE id = ?";

        Connection c = null;
        PreparedStatement ps = null;
        
        try {
            c = Conexao.getConexao();
            ps = c.prepareStatement(sql);
            ps.setString(1, projeto.getNome());
            ps.setString(2, projeto.getDescricao());
            ps.setDate(3, (new Date(projeto.getDataCriacao().getTime())));
            ps.setDate(4, (new Date(projeto.getDataAtualizacao().getTime())));
            ps.setInt(5, projeto.getId());
            ps.execute();
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao atualizar o projeto", e);
        } finally {
            Conexao.closeConnection(c, ps);
        }
    }
    
    public void deletar (int idProjeto){
        String sql = "DELETE FROM projetos WHERE id = ? ";
        
        Connection c = null;
        PreparedStatement ps = null;
        
        try {
            c = Conexao.getConexao();
            ps = c.prepareCall(sql);
            ps.setInt(1, idProjeto);
            ps.execute();
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao deletar a tarefa" + e.getMessage(), e);
        } finally{
            Conexao.closeConnection(c, ps);
        }
    }
    
    public List<Projeto> listarProjetos (){
        String sql ="SELECT * FROM projetos";
        
        Connection c = null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        
        List<Projeto> projetos = new ArrayList<>();
        
        try {
            c = Conexao.getConexao();
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Projeto projeto = new Projeto();
                projeto.setId(rs.getInt("id"));    
                projeto.setNome(rs.getString("nome"));                
                projeto.setDescricao(rs.getString("descricao"));                
                projeto.setDataCriacao(rs.getDate("dataCriacao"));
                projeto.setDataAtualizacao(rs.getDate("dataAtualizacao"));                
                
                projetos.add(projeto);
            }  
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao listar os projetos" + e.getMessage(), e);
        } finally {
            Conexao.closeConnection(c, ps, rs);
        }
        
      return projetos;
   }
}
