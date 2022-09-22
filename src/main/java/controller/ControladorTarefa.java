
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Tarefa;
import util.Conexao;

/**
 *
 * @author renata
 */
public class ControladorTarefa {
    
    public void salvar(Tarefa tarefa){
        String sql = "INSERT INTO tarefas(idProjetos,"
                + "nome,"
                + "descricao,"
                + "completada,"
                + "notas,"
                + "dataLimite"
                + "dataCriacao,"
                + "dataAtualizacao)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        
        Connection c = null;
        PreparedStatement ps = null;
        
        try {
            c = Conexao.getConexao();
            ps = c.prepareCall(sql);
            ps.setInt(1, tarefa.getIdProjeto());
            ps.setString(2, tarefa.getNome());
            ps.setString(3, tarefa.getDescricao());
            ps.setBoolean(4, tarefa.isCompletada());
            ps.setString(5, tarefa.getNotas());
            ps.setDate(6, new Date(tarefa.getDataLimite().getTime()));
            ps.setDate(7, new Date(tarefa.getDataCriacao().getTime()));
            ps.setDate(8, new Date(tarefa.getDataAtualizacao().getTime()));
            ps.execute();
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao salvar a tarefa" + e.getMessage(), e);
        } finally {
            Conexao.closeConnection(c, ps);
        }               
    }
    
    public void atualizar (Tarefa tarefa){
        String sql = "UPDATE tarefas SET"
                + "idProjeto = ?"
                + "nome = ?"
                + "descricao = ?"
                + "completada = ?"
                + "notas = ?"
                + "dataLimite = ?"
                + "dataCriacao = ?"
                + "dataAtualizacao = ?"
                + "WHERE id = ?";
        
        Connection c = null;
        PreparedStatement ps = null;
        
        try {
            c = Conexao.getConexao();
            ps = c.prepareCall(sql);
            ps.setInt(1, tarefa.getIdProjeto());
            ps.setString(2, tarefa.getNome());
            ps.setString(3, tarefa.getDescricao());
            ps.setBoolean(4, tarefa.isCompletada());
            ps.setString(5, tarefa.getNotas());
            ps.setDate(6, (new Date(tarefa.getDataLimite().getTime())));
            ps.setDate(7, (new Date(tarefa.getDataCriacao().getTime())));
            ps.setDate(8, (new Date(tarefa.getDataAtualizacao().getTime())));
            ps.setInt(9, tarefa.getId());
            ps.execute();
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao atualizar a tarefa" + e.getMessage(), e);
        } finally {
            Conexao.closeConnection(c, ps);
        }
    }
    
    public void deletar (int idTarefa){
        String sql = "DELETE FROM tarefas WHERE id = ? ";
        
        Connection c = null;
        PreparedStatement ps = null;
        
        try {
            c = Conexao.getConexao();
            ps = c.prepareCall(sql);
            ps.setInt(1, idTarefa);
            ps.execute();
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao deletar a tarefa" + e.getMessage(), e);
        } finally{
            Conexao.closeConnection(c, ps);
        }
    }
    
    public List<Tarefa> listaTarefas (int idProjeto){
        String sql ="SELECT * FROM tarefas WHERE idProjeto = ?";
        
        Connection c = null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        
        List<Tarefa> tarefas = new ArrayList<>();
        
        try {
            c = Conexao.getConexao();
            ps = c.prepareStatement(sql);
            ps.setInt(1, idProjeto);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Tarefa tarefa = new Tarefa();
                tarefa.setId(rs.getInt("id"));    
                tarefa.setIdProjeto(rs.getInt("idProjeto"));                
                tarefa.setNome(rs.getString("nome"));                
                tarefa.setDescricao(rs.getString("descricao"));                
                tarefa.setNotas(rs.getString("notas"));                
                tarefa.setCompletada(rs.getBoolean("completada"));                
                tarefa.setDataLimite(rs.getDate("dataLimite"));                
                tarefa.setDataCriacao(rs.getDate("dataCriacao"));
                tarefa.setDataAtualizacao(rs.getDate("dataAtualizacao"));                
                
                tarefas.add(tarefa);
            }  
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao listar as tarefas" + e.getMessage(), e);
        } finally {
            Conexao.closeConnection(c, ps, rs);
        }
        
      return tarefas;
   }
    
}
