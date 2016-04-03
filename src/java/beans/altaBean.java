/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import modelo.*;
/**
 *
 * @author Agustin
 */
@Named(value = "altaBean")
@RequestScoped
public class altaBean {
    
    private Turnos T;

    public Turnos getT() {
        return T;
    }

    public void setT(Turnos M) {
        this.T = M;
    }

    /**
     * Creates a new instance of altaBean
     */
    public altaBean() {
        T = new Turnos();
    }
    
    public String insertar() {
        TurnosDAO a = new TurnosDAO();
        a.insertar(T);
        return "turnos";
    }
    
}
