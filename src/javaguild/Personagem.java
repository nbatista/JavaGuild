/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguild;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author nbati_000
 */
@Entity
@Table(name = "personagem", catalog = "guild", schema = "")
@NamedQueries({
    @NamedQuery(name = "Personagem.findAll", query = "SELECT p FROM Personagem p"),
    @NamedQuery(name = "Personagem.findById", query = "SELECT p FROM Personagem p WHERE p.id = :id"),
    @NamedQuery(name = "Personagem.findByNomeJogador", query = "SELECT p FROM Personagem p WHERE p.nomeJogador = :nomeJogador"),
    @NamedQuery(name = "Personagem.findByNomePersonagem", query = "SELECT p FROM Personagem p WHERE p.nomePersonagem = :nomePersonagem"),
    @NamedQuery(name = "Personagem.findByRaca", query = "SELECT p FROM Personagem p WHERE p.raca = :raca"),
    @NamedQuery(name = "Personagem.findByClasse", query = "SELECT p FROM Personagem p WHERE p.classe = :classe"),
    @NamedQuery(name = "Personagem.findByLevelClasse", query = "SELECT p FROM Personagem p WHERE p.levelClasse = :levelClasse"),
    @NamedQuery(name = "Personagem.findByProfissao", query = "SELECT p FROM Personagem p WHERE p.profissao = :profissao"),
    @NamedQuery(name = "Personagem.findByLevelProfissao", query = "SELECT p FROM Personagem p WHERE p.levelProfissao = :levelProfissao"),
    @NamedQuery(name = "Personagem.findByEspecialidade", query = "SELECT p FROM Personagem p WHERE p.especialidade = :especialidade"),
    @NamedQuery(name = "Personagem.findByDomingo", query = "SELECT p FROM Personagem p WHERE p.domingo = :domingo"),
    @NamedQuery(name = "Personagem.findBySegunda", query = "SELECT p FROM Personagem p WHERE p.segunda = :segunda"),
    @NamedQuery(name = "Personagem.findByTerca", query = "SELECT p FROM Personagem p WHERE p.terca = :terca"),
    @NamedQuery(name = "Personagem.findByQuarta", query = "SELECT p FROM Personagem p WHERE p.quarta = :quarta"),
    @NamedQuery(name = "Personagem.findByQuinta", query = "SELECT p FROM Personagem p WHERE p.quinta = :quinta"),
    @NamedQuery(name = "Personagem.findBySexta", query = "SELECT p FROM Personagem p WHERE p.sexta = :sexta"),
    @NamedQuery(name = "Personagem.findBySabado", query = "SELECT p FROM Personagem p WHERE p.sabado = :sabado")})
public class Personagem implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome_jogador")
    private String nomeJogador;
    @Basic(optional = false)
    @Column(name = "nome_personagem")
    private String nomePersonagem;
    @Basic(optional = false)
    @Column(name = "raca")
    private String raca;
    @Basic(optional = false)
    @Column(name = "classe")
    private String classe;
    @Basic(optional = false)
    @Column(name = "level_classe")
    private int levelClasse;
    @Basic(optional = false)
    @Column(name = "profissao")
    private String profissao;
    @Basic(optional = false)
    @Column(name = "level_profissao")
    private int levelProfissao;
    @Basic(optional = false)
    @Column(name = "especialidade")
    private String especialidade;
    @Column(name = "domingo")
    private String domingo;
    @Column(name = "segunda")
    private String segunda;
    @Column(name = "terca")
    private String terca;
    @Column(name = "quarta")
    private String quarta;
    @Column(name = "quinta")
    private String quinta;
    @Column(name = "sexta")
    private String sexta;
    @Column(name = "sabado")
    private String sabado;

    public Personagem() {
    }

    public Personagem(Integer id) {
        this.id = id;
    }

    public Personagem(Integer id, String nomeJogador, String nomePersonagem, String raca, String classe, int levelClasse, String profissao, int levelProfissao, String especialidade) {
        this.id = id;
        this.nomeJogador = nomeJogador;
        this.nomePersonagem = nomePersonagem;
        this.raca = raca;
        this.classe = classe;
        this.levelClasse = levelClasse;
        this.profissao = profissao;
        this.levelProfissao = levelProfissao;
        this.especialidade = especialidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        String oldNomeJogador = this.nomeJogador;
        this.nomeJogador = nomeJogador;
        changeSupport.firePropertyChange("nomeJogador", oldNomeJogador, nomeJogador);
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        String oldNomePersonagem = this.nomePersonagem;
        this.nomePersonagem = nomePersonagem;
        changeSupport.firePropertyChange("nomePersonagem", oldNomePersonagem, nomePersonagem);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        String oldRaca = this.raca;
        this.raca = raca;
        changeSupport.firePropertyChange("raca", oldRaca, raca);
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        String oldClasse = this.classe;
        this.classe = classe;
        changeSupport.firePropertyChange("classe", oldClasse, classe);
    }

    public int getLevelClasse() {
        return levelClasse;
    }

    public void setLevelClasse(int levelClasse) {
        int oldLevelClasse = this.levelClasse;
        this.levelClasse = levelClasse;
        changeSupport.firePropertyChange("levelClasse", oldLevelClasse, levelClasse);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        String oldProfissao = this.profissao;
        this.profissao = profissao;
        changeSupport.firePropertyChange("profissao", oldProfissao, profissao);
    }

    public int getLevelProfissao() {
        return levelProfissao;
    }

    public void setLevelProfissao(int levelProfissao) {
        int oldLevelProfissao = this.levelProfissao;
        this.levelProfissao = levelProfissao;
        changeSupport.firePropertyChange("levelProfissao", oldLevelProfissao, levelProfissao);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        String oldEspecialidade = this.especialidade;
        this.especialidade = especialidade;
        changeSupport.firePropertyChange("especialidade", oldEspecialidade, especialidade);
    }

    public String getDomingo() {
        return domingo;
    }

    public void setDomingo(String domingo) {
        String oldDomingo = this.domingo;
        this.domingo = domingo;
        changeSupport.firePropertyChange("domingo", oldDomingo, domingo);
    }

    public String getSegunda() {
        return segunda;
    }

    public void setSegunda(String segunda) {
        String oldSegunda = this.segunda;
        this.segunda = segunda;
        changeSupport.firePropertyChange("segunda", oldSegunda, segunda);
    }

    public String getTerca() {
        return terca;
    }

    public void setTerca(String terca) {
        String oldTerca = this.terca;
        this.terca = terca;
        changeSupport.firePropertyChange("terca", oldTerca, terca);
    }

    public String getQuarta() {
        return quarta;
    }

    public void setQuarta(String quarta) {
        String oldQuarta = this.quarta;
        this.quarta = quarta;
        changeSupport.firePropertyChange("quarta", oldQuarta, quarta);
    }

    public String getQuinta() {
        return quinta;
    }

    public void setQuinta(String quinta) {
        String oldQuinta = this.quinta;
        this.quinta = quinta;
        changeSupport.firePropertyChange("quinta", oldQuinta, quinta);
    }

    public String getSexta() {
        return sexta;
    }

    public void setSexta(String sexta) {
        String oldSexta = this.sexta;
        this.sexta = sexta;
        changeSupport.firePropertyChange("sexta", oldSexta, sexta);
    }

    public String getSabado() {
        return sabado;
    }

    public void setSabado(String sabado) {
        String oldSabado = this.sabado;
        this.sabado = sabado;
        changeSupport.firePropertyChange("sabado", oldSabado, sabado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personagem)) {
            return false;
        }
        Personagem other = (Personagem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaguild.Personagem[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
