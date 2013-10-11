/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoNegocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class Publicacion {
    public int NoPublicacion;
    public List<String> Comentarios;
    public String Descripcion;

    public Publicacion(int NoPublicacion, String Descripcion) {
        this.NoPublicacion = NoPublicacion;
        this.Comentarios = new ArrayList<>();
        this.Descripcion = Descripcion;
    }

    public int getNoPublicacion() {
        return NoPublicacion;
    }

    public void setNoPublicacion(int NoPublicacion) {
        this.NoPublicacion = NoPublicacion;
    }

    public List<String> getComentarios() {
        return Comentarios;
    }

    public void setComentarios(List<String> Comentarios) {
        this.Comentarios = Comentarios;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "NoPublicacion=" + NoPublicacion + ", Comentarios=" + Comentarios + ", Descripcion=" + Descripcion + '}';
    }
    
    
}
