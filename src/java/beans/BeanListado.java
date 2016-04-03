/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import modelo.Turnos;
import modelo.TurnosDAO;

/**
 *
 * @author Alumnos
 */
@Named(value = "beanListado")
@Dependent
public class BeanListado {

    /**
     * Creates a new instance of BeanListado
     */
   private List<Turnos> m;

    public BeanListado() {
    }

    public List<Turnos> getM() {
        TurnosDAO a = new TurnosDAO();
        this.m = a.buscarTodos();
        return m;
    }
    
}
