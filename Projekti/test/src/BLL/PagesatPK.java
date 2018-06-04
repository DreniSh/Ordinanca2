/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author drens
 */
@Embeddable
public class PagesatPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id-pagesat", nullable = false)
    private int idPagesat;
    @Basic(optional = false)
    @Column(name = "id-pacientit", nullable = false, length = 45)
    private String idPacientit;

    public PagesatPK() {
    }

    public PagesatPK(int idPagesat, String idPacientit) {
        this.idPagesat = idPagesat;
        this.idPacientit = idPacientit;
    }

    public int getIdPagesat() {
        return idPagesat;
    }

    public void setIdPagesat(int idPagesat) {
        this.idPagesat = idPagesat;
    }

    public String getIdPacientit() {
        return idPacientit;
    }

    public void setIdPacientit(String idPacientit) {
        this.idPacientit = idPacientit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPagesat;
        hash += (idPacientit != null ? idPacientit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagesatPK)) {
            return false;
        }
        PagesatPK other = (PagesatPK) object;
        if (this.idPagesat != other.idPagesat) {
            return false;
        }
        if ((this.idPacientit == null && other.idPacientit != null) || (this.idPacientit != null && !this.idPacientit.equals(other.idPacientit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.PagesatPK[ idPagesat=" + idPagesat + ", idPacientit=" + idPacientit + " ]";
    }
    
}
