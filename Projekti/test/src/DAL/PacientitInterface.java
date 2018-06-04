/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import projekti.RregjistrimiPacientit;

/**
 *
 * @author drens
 */
public interface PacientitInterface {
    void create(RregjistrimiPacientit rp)throws DoctorException;
    void edit(RregjistrimiPacientit rp)throws DoctorException;
    void delete(RregjistrimiPacientit rp)throws DoctorException;
    List<RregjistrimiPacientit> findAll()throws DoctorException;
    RregjistrimiPacientit findById(Integer id)throws DoctorException;
}
