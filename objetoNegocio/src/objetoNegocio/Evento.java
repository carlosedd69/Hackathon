/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoNegocio;

import java.util.List;
import objetoServicio.Fecha;

/**
 *
 * @author Adrian
 */
public class Evento {
    public String Nombre;
    public String Descripcion;
    public Fecha FechaInicio;
    public Fecha FechaFin;
    public List<String> Participantes;

    public Evento(String Nombre, String Descripcion, Fecha FechaInicio, Fecha FechaFin, List<String> Participantes) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Participantes = Participantes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Fecha getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Fecha FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Fecha getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Fecha FechaFin) {
        this.FechaFin = FechaFin;
    }

    public List<String> getParticipantes() {
        return Participantes;
    }

    public void setParticipantes(List<String> Participantes) {
        this.Participantes = Participantes;
    }

    @Override
    public String toString() {
        return "Evento{" + "Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", FechaInicio=" + FechaInicio + ", FechaFin=" + FechaFin + ", Participantes=" + Participantes + '}';
    }
    
    
    
}
