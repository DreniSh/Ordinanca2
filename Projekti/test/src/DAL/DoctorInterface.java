/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Doktori;
import java.util.List;

/**
 *
 * @author drens
 */
public interface DoctorInterface {
    void create(Doktori d)throws DoctorException;
    void edit(Doktori d)throws DoctorException;
    void delete(Doktori d)throws DoctorException;
    List<Doktori> findAll()throws DoctorException;
    Doktori findById(Integer id)throws DoctorException;
}
