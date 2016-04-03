/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import org.hibernate.Query;
import modelo.nHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Alumnos
 */
public class TurnosDAO {
    private Session session = nHibernateUtil.getSessionFactory().openSession();
    public TurnosDAO() {
    }
    
    public void insertar(Turnos medi) {
        Transaction tx = session.beginTransaction();
        try {
            session.save(medi);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Error en insertar " + e.getMessage());
            tx.rollback();
        }
    }
    
    public void borrar(Turnos medi) {
        Transaction tx = session.beginTransaction();
        try {
            session.delete(medi);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Error en borrar" + e.getMessage());
            tx.rollback();
        }
    }
    
    public List<Turnos> buscarTodos(){
        session= nHibernateUtil.getSessionFactory().openSession();
        return session.createQuery("from Turnos").list();
    }
    
    public List<Turnos> buscarPorTitulo(String titulo) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Turnos as m where m.medDescripcion like concat('%',:cadena,'%')");
        q.setParameter("cadena", titulo);
        return q.list();
    }
    
}
