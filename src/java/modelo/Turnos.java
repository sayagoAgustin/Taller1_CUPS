package modelo;
// Generated 29-oct-2015 18:56:25 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Turnos generated by hbm2java
 */
public class Turnos  implements java.io.Serializable {


     private Integer turId;
     private Date turFecha;
     private Integer turHora;
     private Integer turMinutos;
     private String turMascotaNombre;
     private String turRaza;
     private String turPropietario;
     private Character turTipoBanio;

    public Turnos() {
    }

	
    public Turnos(Date turFecha) {
        this.turFecha = turFecha;
    }
    public Turnos(Date turFecha, Integer turHora, Integer turMinutos, String turMascotaNombre, String turRaza, String turPropietario, Character turTipoBanio) {
       this.turFecha = turFecha;
       this.turHora = turHora;
       this.turMinutos = turMinutos;
       this.turMascotaNombre = turMascotaNombre;
       this.turRaza = turRaza;
       this.turPropietario = turPropietario;
       this.turTipoBanio = turTipoBanio;
    }
   
    public Integer getTurId() {
        return this.turId;
    }
    
    public void setTurId(Integer turId) {
        this.turId = turId;
    }
    public Date getTurFecha() {
        return this.turFecha;
    }
    
    public void setTurFecha(Date turFecha) {
        this.turFecha = turFecha;
    }
    public Integer getTurHora() {
        return this.turHora;
    }
    
    public void setTurHora(Integer turHora) {
        this.turHora = turHora;
    }
    public Integer getTurMinutos() {
        return this.turMinutos;
    }
    
    public void setTurMinutos(Integer turMinutos) {
        this.turMinutos = turMinutos;
    }
    public String getTurMascotaNombre() {
        return this.turMascotaNombre;
    }
    
    public void setTurMascotaNombre(String turMascotaNombre) {
        this.turMascotaNombre = turMascotaNombre;
    }
    public String getTurRaza() {
        return this.turRaza;
    }
    
    public void setTurRaza(String turRaza) {
        this.turRaza = turRaza;
    }
    public String getTurPropietario() {
        return this.turPropietario;
    }
    
    public void setTurPropietario(String turPropietario) {
        this.turPropietario = turPropietario;
    }
    public Character getTurTipoBanio() {
        return this.turTipoBanio;
    }
    
    public void setTurTipoBanio(Character turTipoBanio) {
        this.turTipoBanio = turTipoBanio;
    }




}


