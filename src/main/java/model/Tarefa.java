
package model;

import java.util.Date;

/**
 *
 * @author renata
 */
public class Tarefa {
    private int id;
    private int idProjeto;
    private String nome;
    private String descricao;
    private String notas;
    private boolean completada;
    private Date dataLimite;
    private Date dataCriacao;
    private Date dataAtualizacao;

    public Tarefa(int id, int idProjeto, String nome, String descricao, String notas, boolean completada, Date dataLimite, Date dataCriacao, Date dataAtualizacao) {
        this.id = id;
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.descricao = descricao;
        this.notas = notas;
        this.completada = completada;
        this.dataLimite = dataLimite;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
    }
    
    public Tarefa(){
        this.dataCriacao = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", idProjeto=" + idProjeto + ", nome=" + nome + ", descricao=" + descricao + ", notas=" + notas + ", completada=" + completada + ", dataLimite=" + dataLimite + ", dataCriacao=" + dataCriacao + ", dataAtualizacao=" + dataAtualizacao + '}';
    }
    
    
    
}
