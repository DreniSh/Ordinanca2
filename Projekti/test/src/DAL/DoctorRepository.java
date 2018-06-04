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
public class DoctorRepository extends EntMngClass implements DoctorInterface {

    @Override
    public void create(Doktori d) throws DoctorException {
        try{
        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
        }catch(Exception e){
            throw new DoctorException("Test 123");
        }
    }
    @Override
    public void edit(Doktori d) throws DoctorException {
        em.getTransaction().begin();
        em.merge(d);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Doktori d) throws DoctorException {
        em.getTransaction().begin();
        em.remove(d);
        em.getTransaction().commit();
    }

    @Override
    public List<Doktori> findAll() throws DoctorException {
        return (List<Doktori>)em.createNamedQuery("Doktori.findAll").getResultList();
    }

    @Override
    public Doktori findById(Integer id) throws DoctorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void test(){
        
    }
    
}
