/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import modelo.Turnos;
import modelo.TurnosDAO;

@Named(value = "bajaBean")
@SessionScoped
public class bajaBean implements Serializable {
    private int codigo;
    private Turnos turno;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Turnos getTurno() {
        return turno;
    }

    public void setTurno(Turnos turno) {
        this.turno = turno;
    }
    /**
     * Creates a new instance of bajaBean
     */
    public bajaBean() {
    }
    public String confirmar(Turnos x){
        this.turno=x;
        return "baja";
    }
    
    public String borrar(){
        TurnosDAO a = new TurnosDAO();
        a.borrar(turno);
        return "turnos";
    }
}
