/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author drens
 */
@Entity
@Table(name = "pagesa", catalog = "ordinanca", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagesat.findAll", query = "SELECT p FROM Pagesat p")
    , @NamedQuery(name = "Pagesat.findByIdPagesat", query = "SELECT p FROM Pagesat p WHERE p.pagesatPK.idPagesat = :idPagesat")
    , @NamedQuery(name = "Pagesat.findByIdPacientit", query = "SELECT p FROM Pagesat p WHERE p.pagesatPK.idPacientit = :idPacientit")
    , @NamedQuery(name = "Pagesat.findByEmri", query = "SELECT p FROM Pagesat p WHERE p.emri = :emri")
    , @NamedQuery(name = "Pagesat.findByMbiemri", query = "SELECT p FROM Pagesat p WHERE p.mbiemri = :mbiemri")})
public class Pagesat implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PagesatPK pagesatPK;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String emri;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String mbiemri;
    @JoinColumn(name = "id-pagesat", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RregjistrimiPacientit rregjistrimiPacientit;

    public Pagesat() {
    }

    public Pagesat(PagesatPK pagesatPK) {
        this.pagesatPK = pagesatPK;
    }

    public Pagesat(PagesatPK pagesatPK, String emri, String mbiemri) {
        this.pagesatPK = pagesatPK;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }

    public Pagesat(int idPagesat, String idPacientit) {
        this.pagesatPK = new PagesatPK(idPagesat, idPacientit);
    }

    public PagesatPK getPagesatPK() {
        return pagesatPK;
    }

    public void setPagesatPK(PagesatPK pagesatPK) {
        this.pagesatPK = pagesatPK;
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

    public RregjistrimiPacientit getRregjistrimiPacientit() {
        return rregjistrimiPacientit;
    }

    public void setRregjistrimiPacientit(RregjistrimiPacientit rregjistrimiPacientit) {
        this.rregjistrimiPacientit = rregjistrimiPacientit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagesatPK != null ? pagesatPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagesat)) {
            return false;
        }
        Pagesat other = (Pagesat) object;
        if ((this.pagesatPK == null && other.pagesatPK != null) || (this.pagesatPK != null && !this.pagesatPK.equals(other.pagesatPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Pagesat[ pagesatPK=" + pagesatPK + " ]";
    }
    
}
