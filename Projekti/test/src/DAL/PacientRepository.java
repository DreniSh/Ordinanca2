/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import projekti.RregjistrimiPacientit;
import java.util.List;

/**
 *
 * @author drens
 */
public class PacientRepository extends EntMngClass implements PacientitInterface {
    @Override
    public void create(RregjistrimiPacientit rp) throws DoctorException {
        try{
        em.getTransaction().begin();
        em.persist(rp);
        em.getTransaction().commit();
        }catch(Exception e){
            throw new DoctorException("Test 123");
        }
    }
    @Override
    public void edit(RregjistrimiPacientit rp) throws DoctorException {
        em.getTransaction().begin();
        em.merge(rp);
        em.getTransaction().commit();
    }

    @Override
    public void delete(RregjistrimiPacientit rp) throws DoctorException {
        em.getTransaction().begin();
        em.remove(rp);
        em.getTransaction().commit();
    }

    @Override
    public List<RregjistrimiPacientit> findAll() throws DoctorException {
        return (List<RregjistrimiPacientit>)em.createNamedQuery("RregjistrimiPacientit.findAll").getResultList();
    }

    @Override
    public RregjistrimiPacientit findById(Integer id) throws DoctorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void test(){
        
    }
}
