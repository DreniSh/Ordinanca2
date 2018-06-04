/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author drens
 */
@Entity
@Table(name = "pacienti", catalog = "ordinanca", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RregjistrimiPacientit.findAll", query = "SELECT r FROM RregjistrimiPacientit r")
    , @NamedQuery(name = "RregjistrimiPacientit.findById", query = "SELECT r FROM RregjistrimiPacientit r WHERE r.id = :id")
    , @NamedQuery(name = "RregjistrimiPacientit.findByEmri", query = "SELECT r FROM RregjistrimiPacientit r WHERE r.emri = :emri")
    , @NamedQuery(name = "RregjistrimiPacientit.findByMbiemri", query = "SELECT r FROM RregjistrimiPacientit r WHERE r.mbiemri = :mbiemri")
    , @NamedQuery(name = "RregjistrimiPacientit.findByMosha", query = "SELECT r FROM RregjistrimiPacientit r WHERE r.mosha = :mosha")
    , @NamedQuery(name = "RregjistrimiPacientit.findByDataLindjes", query = "SELECT r FROM RregjistrimiPacientit r WHERE r.dataLindjes = :dataLindjes")
    , @NamedQuery(name = "RregjistrimiPacientit.findByEmriPrindit", query = "SELECT r FROM RregjistrimiPacientit r WHERE r.emriPrindit = :emriPrindit")})
public class RregjistrimiPacientit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String emri;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String mbiemri;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String mosha;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataLindjes;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String emriPrindit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rregjistrimiPacientit")
    private Collection<Pagesat> pagesatCollection;

    public RregjistrimiPacientit() {
    }

    public RregjistrimiPacientit(Integer id) {
        this.id = id;
    }

    public RregjistrimiPacientit(Integer id, String emri, String mbiemri, String mosha, Date dataLindjes, String emriPrindit) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
        this.dataLindjes = dataLindjes;
        this.emriPrindit = emriPrindit;
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

    public String getMosha() {
        return mosha;
    }

    public void setMosha(String mosha) {
        this.mosha = mosha;
    }

    public Date getDataLindjes() {
        return dataLindjes;
    }

    public void setDataLindjes(Date dataLindjes) {
        this.dataLindjes = dataLindjes;
    }

    public String getEmriPrindit() {
        return emriPrindit;
    }

    public void setEmriPrindit(String emriPrindit) {
        this.emriPrindit = emriPrindit;
    }

    @XmlTransient
    public Collection<Pagesat> getPagesatCollection() {
        return pagesatCollection;
    }

    public void setPagesatCollection(Collection<Pagesat> pagesatCollection) {
        this.pagesatCollection = pagesatCollection;
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
        if (!(object instanceof RregjistrimiPacientit)) {
            return false;
        }
        RregjistrimiPacientit other = (RregjistrimiPacientit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.RregjistrimiPacientit[ id=" + id + " ]";
    }
    
}
