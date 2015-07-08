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
@Table(name = "evento", catalog = "guild", schema = "")
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e"),
    @NamedQuery(name = "Evento.findById", query = "SELECT e FROM Evento e WHERE e.id = :id"),
    @NamedQuery(name = "Evento.findByIdEvento", query = "SELECT e FROM Evento e WHERE e.idEvento = :idEvento"),
    @NamedQuery(name = "Evento.findByNomeGrupo", query = "SELECT e FROM Evento e WHERE e.nomeGrupo = :nomeGrupo"),
    @NamedQuery(name = "Evento.findByNumeroDePersonagem", query = "SELECT e FROM Evento e WHERE e.numeroDePersonagem = :numeroDePersonagem"),
    @NamedQuery(name = "Evento.findByMes", query = "SELECT e FROM Evento e WHERE e.mes = :mes"),
    @NamedQuery(name = "Evento.findByDia", query = "SELECT e FROM Evento e WHERE e.dia = :dia"),
    @NamedQuery(name = "Evento.findByHorario", query = "SELECT e FROM Evento e WHERE e.horario = :horario")})
public class Evento implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id_evento")
    private int idEvento;
    @Basic(optional = false)
    @Column(name = "nome_grupo")
    private String nomeGrupo;
    @Basic(optional = false)
    @Column(name = "numero_de_personagem")
    private int numeroDePersonagem;
    @Basic(optional = false)
    @Column(name = "mes")
    private String mes;
    @Basic(optional = false)
    @Column(name = "dia")
    private String dia;
    @Basic(optional = false)
    @Column(name = "horario")
    private String horario;

    public Evento() {
    }

    public Evento(Integer id) {
        this.id = id;
    }

    public Evento(Integer id, int idEvento, String nomeGrupo, int numeroDePersonagem, String mes, String dia, String horario) {
        this.id = id;
        this.idEvento = idEvento;
        this.nomeGrupo = nomeGrupo;
        this.numeroDePersonagem = numeroDePersonagem;
        this.mes = mes;
        this.dia = dia;
        this.horario = horario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        int oldIdEvento = this.idEvento;
        this.idEvento = idEvento;
        changeSupport.firePropertyChange("idEvento", oldIdEvento, idEvento);
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        String oldNomeGrupo = this.nomeGrupo;
        this.nomeGrupo = nomeGrupo;
        changeSupport.firePropertyChange("nomeGrupo", oldNomeGrupo, nomeGrupo);
    }

    public int getNumeroDePersonagem() {
        return numeroDePersonagem;
    }

    public void setNumeroDePersonagem(int numeroDePersonagem) {
        int oldNumeroDePersonagem = this.numeroDePersonagem;
        this.numeroDePersonagem = numeroDePersonagem;
        changeSupport.firePropertyChange("numeroDePersonagem", oldNumeroDePersonagem, numeroDePersonagem);
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        String oldMes = this.mes;
        this.mes = mes;
        changeSupport.firePropertyChange("mes", oldMes, mes);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        String oldDia = this.dia;
        this.dia = dia;
        changeSupport.firePropertyChange("dia", oldDia, dia);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        String oldHorario = this.horario;
        this.horario = horario;
        changeSupport.firePropertyChange("horario", oldHorario, horario);
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
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaguild.Evento[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
