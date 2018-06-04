/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author drens
 */
@Entity
@Table(catalog = "ordinanca", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doktori.findAll", query = "SELECT d FROM Doktori d")
    , @NamedQuery(name = "Doktori.findById", query = "SELECT d FROM Doktori d WHERE d.id = :id")
    , @NamedQuery(name = "Doktori.findByEmri", query = "SELECT d FROM Doktori d WHERE d.emri = :emri")
    , @NamedQuery(name = "Doktori.findByMbiemri", query = "SELECT d FROM Doktori d WHERE d.mbiemri = :mbiemri")})
public class Doktori implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String emri;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String mbiemri;

    public Doktori() {
    }

    public Doktori(Integer id) {
        this.id = id;
    }

    public Doktori(Integer id, String emri, String mbiemri) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
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
        if (!(object instanceof Doktori)) {
            return false;
        }
        Doktori other = (Doktori) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Doktori[ id=" + id + " ]";
    }
    
}
